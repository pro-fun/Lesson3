package by.academiapvt;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

//        ****** Task1
        int mass1[];
        mass1 = new int[10];
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = (int) (Math.random() * 50);
        }
        for (int j = 0; j < mass1.length; j++) {
            if (j % 2 > 0) mass1[j] = 0;
        }
        System.out.println("Полученный массив: ");
        for (int k = 0; k < mass1.length; k++) {
            System.out.print("\t" + mass1[k]);
        }

//        ****** Task2
        Scanner scanner2 = new Scanner(System.in);
        int mass2[], max = -1000, min = 1000;
        mass2 = new int[10];
        for (int a = 0; a < mass2.length; a++) {
            System.out.println("Введите число массива");
            mass2[a] = scanner2.nextInt();
        }
        for (int z = 0; z < mass2.length; z++) {
            if (mass2[z] > max) max = mass2[z];
        }
        for (int x = 0; x < mass2.length; x++) {
            if (mass2[x] < min) min = mass2[x];
        }
        for (int y = 0; y < mass2.length; y++) {
            if (mass2[y] == max) mass2[y] = 0;
            else if (mass2[y] == min) mass2[y] = 0;
        }
        System.out.println("Введённый вами массив (максимальное и минимальное число(-а) в нём заменены на 0): ");
        for (int v = 0; v < mass2.length; v++) {
            System.out.print("\t" + mass2[v]);
        }

//        ****** Task3
        Scanner scanner3 = new Scanner(System.in);
        int mass3[], key;
        mass3 = new int[10];
        for (int b = 0; b < mass3.length; b++) {
            System.out.println("Введите число массива");
            mass3[b] = scanner3.nextInt();
        }
        for (int n = 0; n < mass3.length; n++) {
            for (int m = 0; m < mass3.length; m++) {
                if (mass3[m] > mass3[n]) {
                    key = mass3[n];
                    mass3[n] = mass3[m];
                    mass3[m] = key;
                }
            }

        }
        System.out.println("Введённый вами массив после сортировки: ");
        for (int l = 0; l < mass3.length; l++) {
            System.out.print("\t" + mass3[l]);
        }

//        ****** Task4
        Scanner scanner4 = new Scanner(System.in);
        int mass4[], key1;
        mass4 = new int[10];
        for (int s = 0; s < mass4.length; s++) {
            System.out.println("Введите число массива");
            mass4[s] = scanner4.nextInt();
        }
        int d = 0, f = 0;
        while (d < mass4.length) {
            while (f < mass4.length) {
                if (mass4[f] > mass4[d]) {
                    key1 = mass4[d];
                    mass4[d] = mass4[f];
                    mass4[f] = key1;
                }
                f++;
            }
            f=0;
            d++;
        }
        System.out.println("Введённый вами массив после сортировки: ");
        for (int h = 0; h < mass4.length; h++) {
            System.out.print("\t" + mass4[h]);
        }
    }
}

