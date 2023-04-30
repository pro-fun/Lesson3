package by.academiapvt;

import java.util.*;

public class ThreadForRandomMaths extends Thread{
    public ThreadForRandomMaths(String name) {
        super(name);
    }

    @Override
    public void run() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int)(Math.random()*100));
        }
        int max = Collections.max(numbers);
        System.out.println(Thread.currentThread().getName() + " " + "Максимальное число = " + max);
    }
}
