package by.academiapvt.lessonone;
import java.util.Scanner;

public class lesson2 {
     public static void main (String [] args){

          Scanner console = new Scanner(System.in);
          System.out.println("Введите a");
          int a  = console.nextInt();
          System.out.println("Введите b");
          int b  = console.nextInt();
          // 1.1
          int c = (a%b>0)? a%b : a/b;
          System.out.println(c);
          // 1.2
          int d = (a==0)? b : a/b;
          System.out.println(d);
          // 1.3
          int e = (a==-1)? (a+b) : a*b;
          System.out.println(e);
          // 1.4
          int f = (a!=0 && a>1)? (b/a) : a+b;
          System.out.println(f);
     }
}
