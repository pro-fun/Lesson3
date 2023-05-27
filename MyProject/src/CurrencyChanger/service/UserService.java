package CurrencyChanger.service;

import CurrencyChanger.domain.User;

public interface UserService {



    User registration(String login, String password, String name, String surname);
    User checkPassword (String login, String password);
    void changePassword(String login, String oldPassword, String newPassword);
    void changeLogin(String login, String password, String newLogin);
}
