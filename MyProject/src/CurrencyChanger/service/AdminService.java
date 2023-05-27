package CurrencyChanger.service;

import CurrencyChanger.domain.ChangeCurrency;
import CurrencyChanger.domain.User;

import java.util.List;

public interface AdminService {
    User findByLogin(String login);
    List<User> ListAllClients();
    void deleteClient(long clientId);
    void downloadChangeCurrencies();
}
