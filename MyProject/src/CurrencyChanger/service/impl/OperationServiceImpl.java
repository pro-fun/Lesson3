package CurrencyChanger.service.impl;
import CurrencyChanger.domain.Account;
import CurrencyChanger.domain.ChangeCurrency;
import CurrencyChanger.domain.Operation;
import CurrencyChanger.domain.User;
import CurrencyChanger.repository.AccountRepository;
import CurrencyChanger.repository.CurrencyRepository;
import CurrencyChanger.repository.OperationRepository;
import CurrencyChanger.repository.UserRepository;
import CurrencyChanger.service.OperationService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class OperationServiceImpl implements OperationService {


    private AccountRepository accountRepository = new AccountRepository();
    private CurrencyRepository currencyRepository = new CurrencyRepository();
    private OperationRepository operationRepository = new OperationRepository();
    private UserRepository userRepository = new UserRepository();

    public OperationServiceImpl() {
        this.accountRepository = accountRepository;
        this.currencyRepository = currencyRepository;
        this.operationRepository = operationRepository;
        this.userRepository = userRepository;
        accountRepository.updateAccounts();
        currencyRepository.updateCurrencies();
        operationRepository.updateOperations();
        userRepository.updateUsers();
    }

    @Override
    public void writeOperation(Long clientId, String accountNumber, String accountNumberToPass, Double sum) {
        Account account1 = accountRepository.findById(accountNumber);
        User user = userRepository.getUserById(clientId);
        Account account2 = accountRepository.findById(accountNumber);
        List<Operation> operations = operationRepository.allOperations();
        String currentTime = getTime();
        var time = getLocalDateTime();
        Double comm = sum * 0.001;
        Operation operation = new Operation(time, currentTime, user.getName(), user.getSurname(), accountNumber, accountNumberToPass, account1.getCurrency(), account2.getCurrency(), sum, comm, clientId);
        Long operationId = 1L;
        if (!operations.isEmpty()) {
            operationId = operations.get(operations.size() - 1).getId() + 1;
        }
        operation.setId(operationId);
        operationRepository.addOperation(operation);
        operationRepository.saveChangesWithOperations();
    }

    private String getTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("'Дата: 'dd MMM yyyy', время: 'HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(dateTimeFormatter);
    }

    private LocalDateTime getLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime;
    }

    @Override
    public List<ChangeCurrency> changeCurrencies() {
        return currencyRepository.allChangeCurrencies();
    }

    @Override
    public List<Operation> getOperationHistory(Long clientId, int year1, int month1, int day1, int year2, int month2, int day2) {
        List<Operation> operations = operationRepository.findOperationsByClient(clientId);
        var localDateTime1 = LocalDateTime.of(year1, month1, day1, 00, 00);
        var localDateTime2 = LocalDateTime.of(year2, month2, day2, 23, 59);
        List<Operation> operationsByFirstDateTime = operations.stream().filter(operation1 -> operation1.getTime().isAfter(localDateTime1)).toList();
        List<Operation> requiredOperations = operationsByFirstDateTime.stream().filter(operation -> operation.getTime().isBefore(localDateTime2)).toList();
        return requiredOperations;
    }

    @Override
    public List<Operation> getOperationByClient(Long clientId) {
        List<Operation> operations = operationRepository.findOperationsByClient(clientId);
        return operations;
    }


    @Override
    public List<Operation> readAllOperations() {
        List<Operation> operations = operationRepository.allOperations();
        return operations;
    }
}


