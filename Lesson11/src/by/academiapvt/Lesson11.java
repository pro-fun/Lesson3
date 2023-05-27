package by.academiapvt;

import java.util.ArrayList;
import java.util.List;

public class Lesson11 {
    public static void main(String[] args) {
        List<String> arraylist = new ArrayList();
        String first = "первый";
        String second = "второй";
        String third = "третий";
        String fourth = "четвертый";
        String fifth = "пятый";
        arraylist.add(first);
        arraylist.add(second);
        arraylist.add(third);
        arraylist.add(fourth);
        arraylist.add(fifth);
        boolean f = arraylist.contains("первый");
        System.out.println(f);
        arraylist.remove((arraylist.size()-1));
        arraylist.remove((arraylist.size()-1));
        System.out.println(arraylist.size());






    }
}
