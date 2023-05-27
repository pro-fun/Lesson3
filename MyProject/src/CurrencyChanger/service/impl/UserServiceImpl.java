package CurrencyChanger.service.impl;

import CurrencyChanger.constants.Role;
import CurrencyChanger.domain.User;
import CurrencyChanger.exception.ClientException;
import CurrencyChanger.repository.CurrencyRepository;
import CurrencyChanger.repository.UserRepository;
import CurrencyChanger.service.UserService;

import java.util.List;


public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepository();


    public UserServiceImpl() {
        this.userRepository = userRepository;
        userRepository.updateUsers();
    }


    @Override
    public User registration(String login, String password, String name, String surname) {
        List<User> users = userRepository.allUsers();
        boolean isLoginPresent = users.stream().anyMatch(user1 -> user1.getLogin().equals(login));
        if (isLoginPresent) {
            throw new ClientException("Введённый логин " + login + " уже занят. Введите другой логин.");
        }
        boolean isAdminPresent = users.stream().anyMatch(user2 -> user2.getRole().equals(Role.ADMIN));
        if (!isAdminPresent) {
            User user = new User(name, surname, login, password);
            user.setRole(Role.ADMIN);
            long id = 1L;
            if (!users.isEmpty()) {
                id = users.get(users.size() - 1).getId() + 1;
            }
            user.setId(id);
            return userRepository.addUser(user);
        }
        User user = new User(name, surname, login, password);
        user.setRole(Role.USER);
        user.setId(users.get(users.size() - 1).getId() + 1);
        return userRepository.addUser(user);
    }

    @Override
    public User checkPassword(String login, String password) {
        List<User> users = userRepository.allUsers();
        User user = users.stream().filter(user1 -> user1.getLogin().equals(login)).findFirst().orElseThrow(()->new ClientException("Пользователь с логином " + login + "не найден"));
        if (!user.getPassword().equals(password)){
            throw new ClientException("Не верно введён пароль");
        }
        return user;
    }

    @Override
    public void changePassword(String login, String oldPassword, String newPassword) {
        List<User> users = userRepository.allUsers();
        User user = users.stream().filter(user1 -> user1.getLogin().equals(login)).findFirst().orElseThrow(()->new ClientException("Пользователь с логином " + login + "не найден"));
        if (!user.getPassword().equals(oldPassword)){
            throw new ClientException("Не верно введён пароль");
        }
        user.setPassword(newPassword);
        userRepository.saveChangesWithUsers(users);


    }

    @Override
    public void changeLogin(String login, String password, String newLogin) {
        List<User> users = userRepository.allUsers();
        User user = users.stream().filter(user1 -> user1.getLogin().equals(login)).findFirst().orElseThrow(()->new ClientException("Пользователь с логином " + login + "не найден"));
        if (!user.getPassword().equals(password)){
            throw new ClientException("Не верно введён пароль");
        }
        user.setLogin(newLogin);
        userRepository.saveChangesWithUsers(users);
    }
}
