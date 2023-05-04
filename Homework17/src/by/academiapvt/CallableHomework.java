package by.academiapvt;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class CallableHomework implements Callable<String> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CallableHomework(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Integer delay = (int)(Math.random() * 10000);
        if(delay<1000){
            delay = delay+1000;
        }
        currentThread().setName(name);
        sleep(delay);
        System.out.println(currentThread().getName());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer number = (int) (Math.random() * 100);
            list.add(number);
        }

        Integer sum = 0;
        for (Integer l: list) {
            sum = sum + l;
        }
        return sum.toString();
    }
}
