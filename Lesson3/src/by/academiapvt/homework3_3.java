package by.academiapvt;

import java.util.Scanner;

public class homework3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x");
        int x = scanner.nextInt();
        int result = 15 / x;
        switch (result) {
            case 3: {
                if (x == 5)
                    System.out.println("Результат деления равен 3");
                else System.out.println("Результат деления равен дробному числу = " + (float) 15 / x);
            }
            break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу = " + (float) 15 / x);

        }
    }
}
