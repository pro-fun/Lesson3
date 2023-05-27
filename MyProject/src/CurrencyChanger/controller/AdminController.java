package CurrencyChanger.controller;

import CurrencyChanger.constants.Currencies;
import CurrencyChanger.domain.Account;
import CurrencyChanger.domain.Operation;
import CurrencyChanger.domain.User;
import CurrencyChanger.service.AccountService;
import CurrencyChanger.service.AdminService;
import CurrencyChanger.service.OperationService;
import CurrencyChanger.service.UserService;


import java.util.List;
import java.util.Scanner;

public class AdminController {
    private final AccountService accountService;
    private final OperationService operationService;
    private final AdminService adminService;
    private final UserService userService;

    public AdminController(AccountService accountService, OperationService operationService,UserService userService, AdminService adminService) {
        this.accountService = accountService;
        this.operationService = operationService;
        this.userService = userService;
        this.adminService = adminService;
    }

    public void adminProcess(Scanner scanner, User user) {
        System.out.println("""
                Выберите необходимый пункт\s
                1 - Просмотр всех клиентов
                2 - Просмотр операций по клиенту
                3 - Удаление клиента
                4 - Смена пароля
                5 - Смена логина
                6 - Создание счёта
                7 - Загрузка курсов из файла
//                8 - Просмотр операций с неоплаченными комиссиями
                8 - Перевод комиссий на счёт
//                10 - Получить сумму комиссий не переведённых на счёт администратора
                11 - Регистрация пользователя
                12 - Просмотр клиента по логину
                13 - Просмотр всех счетов
                14 - Просмотр всех операций
                15 - Выход\s
                """);
        String choice = scanner.nextLine();
        long clientId = user.getId();
        switch (choice) {

            case "1":
                List<User> users = adminService.ListAllClients();
                System.out.println(users);
                break;
            case "2":
                System.out.println("Введите ID клиента");
                clientId = scanner.nextLong();
                List<Operation> operations = operationService.getOperationByClient(clientId);
                System.out.println(operations);
                break;
            case "3":
                System.out.println("Введите ID клиента");
                clientId = scanner.nextLong();
                adminService.deleteClient(clientId);
                break;
            case "4":
                changePassword(scanner);
                break;
            case "5":
                changeLogin(scanner);
                break;
            case "6":
                System.out.println("Введите номер счета");
                String accountNumber = scanner.nextLine();
                Currencies currency = chooseCurrency(scanner);
                accountService.createAccount(accountNumber, currency, clientId);
                break;
            case "7":
                adminService.downloadChangeCurrencies();
                break;
            case "8":
                System.out.println("Введите ID клиента");
                Long acID = scanner.nextLong();

                break;
            case "10":

                break;
            case "11":
                registration(scanner);
                break;
            case "12":
                System.out.println("Введите логин");
                String login = scanner.nextLine();
                System.out.println(adminService.findByLogin(login));
                break;
            case "13":
                System.out.println(accountService.allAccounts());
                break;
            case "14":
                System.out.println(operationService.readAllOperations());
//
//            case "15":
//                throw new ExitException();
//            default:
//                throw new FileException();

        }
        adminProcess(scanner, user);
    }
    private Account getByAccountNumber(Scanner scanner) {
        System.out.println("Введите номер счета");
        String accountNumber = scanner.nextLine();
        return accountService.getByNumberAccount(accountNumber);
    }

    private void changePassword(Scanner scanner) {
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите Ваш старый пароль");
        String oldPassword = scanner.nextLine();
        System.out.println("Введите новый пароль");
        String newPassword = scanner.nextLine();
        userService.changePassword(login, oldPassword, newPassword);
    }
    private void changeLogin(Scanner scanner) {
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        System.out.println("Введите новый логин");
        String newLogin = scanner.nextLine();
        userService.changeLogin(login, password, newLogin);
    }
    private Currencies chooseCurrency(Scanner scanner) {
        System.out.println("""
                Введите валюту счёта в следующем формате:
                BYN - белорусский рубль
                USD - доллар США
                EUR - евро
                RUB - российский рубль""");
        String currency = scanner.nextLine();
        Currencies chosenCurrency = null;
        if (currency.equals("BYN")) {
            chosenCurrency = Currencies.BYN;
        } else if (currency.equals("USD")) {
            chosenCurrency = Currencies.USD;
        } else if (currency.equals("EUR")) {
            chosenCurrency = Currencies.EUR;
        } else if (currency.equals("RUB")) {
            chosenCurrency = Currencies.RUB;
        } else {
            System.out.println("Вы ввели неправильную аббревиатуру валюты");
            chooseCurrency(scanner);
        }
        return chosenCurrency;
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
