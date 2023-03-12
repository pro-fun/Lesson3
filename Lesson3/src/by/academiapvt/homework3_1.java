package by.academiapvt;

import java.util.Scanner;

public class homework3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        System.out.println("Введите c");
        int c = scanner.nextInt();

        if ((a % 2) == 0) {
            System.out.println("Число a = " + a + " является чётным");
        }
        if ((b % 2) == 0) {
            System.out.println("Число b = " + a + " является чётным");
        }
        if ((c % 2) == 0) {
            System.out.println("Число c = " + a + " является чётным");
        }
        if ((a % 2) > 0 && (b % 2) > 0 && (c % 2) > 0) System.out.println("Среди введённых чисел нет чётных");
// насколько я понимаю, чтобы не выводить в консоль каждое проверенное число, а сначала собрать все в переменную
// а потом вывести все походящие, надо использовать Arraylist? Тогда можно дополнительно не проверять в конце на отсутствие
// нулевых совпадений?
    }
}