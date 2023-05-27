package CurrencyChanger.controller;

import CurrencyChanger.domain.Account;
import CurrencyChanger.domain.User;
import CurrencyChanger.service.AccountService;
import CurrencyChanger.service.OperationService;
import CurrencyChanger.service.UserService;
import CurrencyChanger.constants.Currencies;

import java.util.List;
import java.util.Scanner;

public class ClientController {
    private final AccountService accountService;
    private final OperationService operationService;
    private final UserService userService;

    public ClientController(AccountService accountService, OperationService operationService, UserService userService) {
        this.accountService = accountService;
        this.operationService = operationService;
        this.userService = userService;
    }

    public void clientProcess(Scanner scanner, User user) {
        System.out.println("Здравствуйте," + user.getName() + " " + user.getSurname());
        System.out.println("""

                 Выберите необходимый пункт\s
                1 - Обмен валюты\s
                2 - Перевод средств на другой счёт
                3 - Просмотр баланса на счетах
                4 - Просмотр текущих курсов
                5 - Создание счёта
                6 - Внесение денег на счёт
                7 - Удаление счёта
                8 - Смена пароля
                9 - Смена логина
                10 - Подсчёт общей суммы на счетах в BYN
                11 - Поиск операций текущего пользователя за временной диапазон (история)
                12 - Выход\s
                """);
        String choice = scanner.nextLine();
        long clientId = user.getId();
        try {
            switch (choice) {
                case "1", "2":
                    changeCurrency(scanner, clientId);
                    break;
                case "3":
                    System.out.println(accountService.getAccountsByClient(clientId).toString());
                    break;
                case "4":
                    System.out.println(operationService.changeCurrencies().toString());
                    break;
                case "5":
                    System.out.println("Введите номер счета");
                    String accountNumber = scanner.nextLine();
                    Currencies currency = chooseCurrency(scanner);
                    accountService.createAccount(accountNumber, currency, clientId);
                    break;
                case "6":
                    System.out.println("Введите id счета");
                    String id = scanner.nextLine();
                    System.out.println("Введите сумму пополнения");
                    Double sum = scanner.nextDouble();
                    accountService.passMoney(id, sum);
                    break;
                case "7":
                    System.out.println("Введите id счета");
                    String accid = scanner.nextLine();
                    accountService.deleteAccount(accid, clientId);
                    break;
                case "8":
                    changePassword(scanner);
                    break;
                case "9":
                    changeLogin(scanner);
                    break;
                case "10":
                    System.out.println(accountService.calculateSumOnAccounts(clientId));
                    break;
                case "11":
                    checkOperationHistory(scanner, clientId);
                    break;
                case "12":
                    System.exit(1);
                    break;
            }
        } catch (RuntimeException e) {
            clientProcess(scanner, user);
        }
        clientProcess(scanner, user);
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
                R
                UB - российский рубль""");
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

    private void changeCurrency(Scanner scanner, Long clientId) {
        System.out.println("Введите id счета, с которого перевести деньги");
        String accountNumber = scanner.nextLine();
        System.out.println("Введите id счета, на который перевести деньги");
        String accountNumberToPass = scanner.nextLine();
        System.out.println("Введите сумму для перевода");
        Double sum = scanner.nextDouble();
        accountService.checkAccountsForUser(clientId, accountNumber, accountNumberToPass);
        accountService.changeCurrency(accountNumber, accountNumberToPass, sum);
        operationService.writeOperation(clientId, accountNumber, accountNumberToPass, sum);
    }

    private void checkOperationHistory(Scanner scanner, Long clientId){
        System.out.println("Введите начальную дату интервала для поиска - год (4 цифры):");
        int year1 = scanner.nextInt();
        System.out.println("Введите начальную дату интервала для поиска - месяц (2 цифры):");
        int month1 = scanner.nextInt();
        System.out.println("Введите начальную дату интервала для поиска - день (2 цифры):");
        int day1 = scanner.nextInt();
        System.out.println("Введите конечную дату интервала для поиска - год (4 цифры):");
        int year2 = scanner.nextInt();
        System.out.println("Введите конечную дату интервала для поиска - месяц (2 цифры):");
        int month2 = scanner.nextInt();
        System.out.println("Введите конечную дату интервала для поиска - день (2 цифры):");
        int day2 = scanner.nextInt();
        System.out.println(operationService.getOperationHistory(clientId, year1, month1, day1, year2, month2, day2));
    }

}

