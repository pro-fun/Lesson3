package CurrencyChanger.service.impl;

import CurrencyChanger.domain.ChangeCurrency;
import CurrencyChanger.domain.User;
import CurrencyChanger.repository.AccountRepository;
import CurrencyChanger.repository.CurrencyRepository;
import CurrencyChanger.repository.UserRepository;
import CurrencyChanger.service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    private UserRepository userRepository = new UserRepository();
    private AccountRepository accountRepository = new AccountRepository();
    private CurrencyRepository currencyRepository = new CurrencyRepository();
    public AdminServiceImpl() {

        this.accountRepository = accountRepository;
        this.currencyRepository = currencyRepository;
        this.userRepository = userRepository;
        userRepository.updateUsers();
        accountRepository.updateAccounts();
        currencyRepository.updateCurrencies();
    }

    @Override
    public User findByLogin(String login) {
        return userRepository.getUserByLogin(login);
    }

    @Override
    public List<User> ListAllClients() {
        return userRepository.allUsers();
    }

    @Override
    public void deleteClient(long clientId) {
        userRepository.deleteUser(userRepository.getUserById(clientId));
    }

    @Override
    public void downloadChangeCurrencies() {

        currencyRepository.downloadChangeCurrencies();

    }
}
