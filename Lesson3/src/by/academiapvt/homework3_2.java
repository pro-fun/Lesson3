package by.academiapvt;

import java.util.Scanner;

public class homework3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        System.out.println("Введите c");
        int c = scanner.nextInt();
        int i = 0;
        if ((a % 2) == 0 && (a % 5) == 0) {
            System.out.println("Число a = " + a + " делится на 2 и на 5");
            i++;
        }
        if ((b % 2) == 0 && (b % 5) == 0) {
            System.out.println("Число b = " + b + " делится на 2 и на 5");
            i++;
        }
        if ((c % 2) == 0 && (c % 5) == 0) {
            System.out.println("Число c = " + c + " делится на 2 и на 5");
            i++;
        }
        if (i==0)  {
            System.out.println("Не введено чисел, которые делятся на 2 и на 5");
        }
    }
}
