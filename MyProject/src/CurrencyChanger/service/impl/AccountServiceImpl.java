package CurrencyChanger.service.impl;

import CurrencyChanger.domain.Account;
import CurrencyChanger.exception.AccountException;
import CurrencyChanger.repository.AccountRepository;
import CurrencyChanger.repository.CurrencyRepository;
import CurrencyChanger.service.AccountService;
import CurrencyChanger.constants.Currencies;
import CurrencyChanger.service.OperationService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository = new AccountRepository();
    private CurrencyRepository currencyRepository = new CurrencyRepository();

    public AccountServiceImpl() {
        this.accountRepository = accountRepository;
        this.currencyRepository = currencyRepository;
        accountRepository.updateAccounts();
        currencyRepository.updateCurrencies();
    }


    @Override
    public List<Account> allAccounts() {
        return accountRepository.allAccounts();
    }

    @Override
//    public List<Account> getAccountsByClient(Long userId) {
//        List<Account> accountsByClient = accountRepository.findAccountsByClient(userId);
//        return accountsByClient;
//            }
    public List<Account> getAccountsByClient(Long userId) {
        accountRepository.updateAccounts();
        return accountRepository.findAccountsByClient(userId);
    }

    @Override
    public Account getByNumberAccount(String accountNumber) {
        return null;
    }

    @Override
    public void deleteAccount(String id, Long userId) {
        Account account = accountRepository.findById(id);
        if (account.getUserId().equals(userId)) {
            accountRepository.deleteAccount(account);
        } else System.out.println("У Вас нет счёта с ID:" + id);
    }

    @Override
    public Double calculateSumOnAccounts(Long userId) {
        List<Account> accounts = accountRepository.findAccountsByClient(userId);
        Double sum = 0D;
        for (Account account : accounts) {
            Double changeCurrency = 1D;
            if (!account.getCurrency().equals(Currencies.BYN)) {
                changeCurrency = currencyRepository.getCurrency(Currencies.BYN, account.getCurrency());
            }
            sum = sum + account.getValue() * changeCurrency;
        }
        return sum;
    }

    @Override
    public Account createAccount(String id, Currencies currencies, Long userId) {
        List<Account> accounts = accountRepository.allAccounts();
        Double value = 0D;
        Account account = new Account(id, currencies, value, userId);
        Long accountId = 1L;
        if (!accounts.isEmpty()) {
            accountId = accounts.get(accounts.size() - 1).getAccountId() + 1;
        }
        account.setAccountId(accountId);
        return accountRepository.addAccount(account);
    }

    @Override
    public Account passMoney(String id, Double sum) {
        Account account = accountRepository.findById(id);
        account.setValue(account.getValue() + sum);
        accountRepository.saveChangesWithAccounts();
        return account;
    }

    @Override
    public void changeCurrency(String accountNumber, String accountNumberToPass, Double sum) {
        Account account1 = accountRepository.findById(accountNumber);
        Account account2 = accountRepository.findById(accountNumberToPass);
        Double changeCurrency = getCurrency(account1, account2);
        if (account1.getValue() / changeCurrency > sum*1.001) {
            account1.setValue(account1.getValue() - account1.getValue() / changeCurrency);
            account2.setValue(account2.getValue() + sum);
            accountRepository.passComission(sum*0.001);
            accountRepository.saveChangesWithAccounts();

        } else System.out.println("На вашем счёте недостаточно средств для покупки введённой суммы");

    }

    @Override
    public void checkAccountsForUser(Long clientId, String accountNumber, String accountNumberToPass) {
        accountRepository.updateAccounts();
        List<Account> accountsByUser = accountRepository.findAccountsByClient(clientId);
        Account account1 = accountsByUser.stream().filter(account -> account.getId().equals(accountNumber)).findFirst().orElseThrow(() -> new AccountException("Аккаунт с номером " + accountNumber + "не найден"));
        Account account2 = accountsByUser.stream().filter(account -> account.getId().equals(accountNumberToPass)).findFirst().orElseThrow(() -> new AccountException("Аккаунт с номером " + accountNumberToPass + "не найден"));
    }

    private Double getCurrency(Account account1, Account account2) {
        Double changeCurrency = 1D;
        if (!account1.getCurrency().equals(account2.getCurrency())) {
            changeCurrency = currencyRepository.getCurrency(account1.getCurrency(), account2.getCurrency());
        }
        return changeCurrency;
    }
}
