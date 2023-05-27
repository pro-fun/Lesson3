package by.academiapvt;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        CallableHomework callableHomework1 = new CallableHomework("first");
        CallableHomework callableHomework2 = new CallableHomework("second");
        CallableHomework callableHomework3 = new CallableHomework("third");
        CallableHomework callableHomework4 = new CallableHomework("fourth");
        CallableHomework callableHomework5 = new CallableHomework("fifth");
        CallableHomework callableHomework6 = new CallableHomework("sixth");
        CallableHomework callableHomework7 = new CallableHomework("seventh");
        CallableHomework callableHomework8 = new CallableHomework("eighth");
        CallableHomework callableHomework9 = new CallableHomework("nines");
        CallableHomework callableHomework10 = new CallableHomework("tens");

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> future1 = executorService.submit(callableHomework1);
        Future<String> future2 = executorService.submit(callableHomework2);
        Future<String> future3 = executorService.submit(callableHomework3);
        Future<String> future4 = executorService.submit(callableHomework4);
        Future<String> future5 = executorService.submit(callableHomework5);
        Future<String> future6 = executorService.submit(callableHomework6);
        Future<String> future7 = executorService.submit(callableHomework7);
        Future<String> future8 = executorService.submit(callableHomework8);
        Future<String> future9 = executorService.submit(callableHomework9);
        Future<String> future10 = executorService.submit(callableHomework10);

        try{
            String result1 = future1.get();
            String result2 = future2.get();
            String result3 = future3.get();
            String result4 = future4.get();
            String result5 = future5.get();
            String result6 = future6.get();
            String result7 = future7.get();
            String result8 = future8.get();
            String result9 = future9.get();
            String result10 = future10.get();

            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
            System.out.println(result5);
            System.out.println(result6);
            System.out.println(result7);
            System.out.println(result8);
            System.out.println(result9);
            System.out.println(result10);

        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
