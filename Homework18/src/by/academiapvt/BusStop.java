package by.academiapvt;

import java.util.concurrent.Semaphore;

public class BusStop extends Bus implements Runnable {
    private final int numberOfStop;
    private final Semaphore semaphore;


    public BusStop(int numberOfStop, Semaphore semaphore) {
        this.numberOfStop = numberOfStop;
        this.semaphore = semaphore;
    }



    @Override
    public void run() {

            try {
                semaphore.acquire();
                for (int i=0; i<10;i++){
                    System.out.println("Автобус номер " + Thread.currentThread().getName() + " производит посадку пассажиров на остановке № " + numberOfStop +" - " + i);
                }
                System.out.println("Автобус номер " + Thread.currentThread().getName() + " закончил посадку пассажиров на остановке № " + numberOfStop );
                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


}
