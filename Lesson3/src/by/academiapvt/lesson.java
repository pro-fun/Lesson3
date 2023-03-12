package by.academiapvt;
import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        int c;
        if (a > b) {
            c = (a - b);
        }
        else if (a==b) {
            c = (a + b);
        }
        else c = (b-a);
        System.out.println("с = " + c );

    }
}
