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

//        ************ Task3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, не кратное 10");
        int k = scanner.nextInt();
        int m = 0;
        while (k > 0) {
            m = k % 10;
            k /= 10;
            System.out.print(m);
        }

//        ************ Task4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, не кратное 10");
        int z = scanner.nextInt();
        int x = 0;
        int y;
        System.out.println("Четными цифрами во введенном числе являются: ");
        y=z;
        while (y > 0) {
            x = y % 10;
            if ((y%2)==0) System.out.print(x);
            y /= 10;
        }
        System.out.println("\n" + "Нечетными цифрами во введенном числе являются: ");
        while (z > 0) {
            x = z % 10;
            if ((z%2)>0) System.out.print(x);
            z /= 10;
        }

    }
}

