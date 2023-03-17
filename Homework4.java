package by.academiapvt;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

//        ************** Task1
        int i;
        for (i=1;i<100;i++){
            if (i%3==0 || i%7==0) System.out.println("Число " + i + " кратно 3 или 7");
        }

//        ************** Task2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int c = 0;
        int n;
        if (a > b) {
            for (n = (a - 1); n > b; n--) {
                c += n;
            }
            System.out.println("Сумма чисел между заданными числами равна " + c);
        }
        else if (a < b) {
            for (n = (b - 1); n > a; n--) {
                c += n;
            }
            System.out.println("Сумма чисел между заданными числами равна " + c);
        }
        else System.out.println("Вы ввели одинаковые числа");

//        ************** Task3

    }
}

