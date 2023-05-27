package CurrencyChanger;

import CurrencyChanger.constants.Role;
import CurrencyChanger.controller.AdminController;
import CurrencyChanger.controller.ClientController;
import CurrencyChanger.controller.UserController;
import CurrencyChanger.domain.User;
import CurrencyChanger.service.AccountService;
import CurrencyChanger.service.AdminService;
import CurrencyChanger.service.OperationService;
import CurrencyChanger.service.UserService;
import CurrencyChanger.service.impl.AccountServiceImpl;
import CurrencyChanger.service.impl.AdminServiceImpl;
import CurrencyChanger.service.impl.OperationServiceImpl;
import CurrencyChanger.service.impl.UserServiceImpl;
import org.w3c.dom.events.EventException;

import java.util.Scanner;

public class Changer {
    public void mainMenu() {
        String choice = "";
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserServiceImpl();
        AccountService accountService = new AccountServiceImpl();
        OperationService operationService = new OperationServiceImpl();
        AdminService adminService = new AdminServiceImpl();
        UserController userController = new UserController(userService);
        ClientController clientController = new ClientController(accountService, operationService, userService);
        AdminController adminController = new AdminController(accountService, operationService, userService, adminService);
        try {
            while ((!choice.equals("STOP"))) {
                System.out.println("Выберите необходимый пункт \n" +
                        "1 - Регистрация пользователя \n" +
                        "2 - Войти в кабинет \n" +
                        "STOP - Выход из программы \n");
                String command = scanner.nextLine();
                if (command.equals("1")) {
                    User user = userController.registration(scanner);
                } else if (command.equals("2")) {
                    User user = userController.authentication(scanner);
                    goToMenu(user, scanner, adminController, clientController);
                }
                System.out.println("Выберите необходимый пункт \n" +
                        "1 - Регистрация пользователя \n" +
                        "2 - Войти в кабинет \n" +
                        "STOP - Выход из программы \n");
                choice = scanner.nextLine();
            }
            System.exit(1);
//            BankException
        } catch (EventException e) {
            System.err.println(e.getMessage());
            scanner.reset();
            mainMenu();
//            ExitException
        } catch (RuntimeException e) {
            mainMenu();
        }

    }
    private void goToMenu(User user, Scanner scanner, AdminController adminController, ClientController clientController){
        if ((user.getRole().equals(Role.ADMIN))){
            adminController.adminProcess(scanner, user);
        } else {
            clientController.clientProcess(scanner, user);
        }

    }
}
