package CurrencyChanger.controller;

import CurrencyChanger.domain.User;
import CurrencyChanger.service.UserService;

import java.util.Scanner;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    public User authentication(Scanner scanner){
        System.out.println("Введите Логин");
        String login = scanner.nextLine();
        System.out.println("Введите Пароль");
        String password = scanner.nextLine();
        return userService.checkPassword(login, password);

    }
    public User registration(Scanner scanner){
        System.out.println("Введите Логин");
        String login = scanner.nextLine();
        System.out.println("Введите Пароль");
        String password = scanner.nextLine();
        System.out.println("Введите Имя");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию");
        String surname = scanner.nextLine();
        return userService.registration(login,password,name,surname);
    }
}
