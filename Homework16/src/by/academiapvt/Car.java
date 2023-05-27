package by.academiapvt;

public class Car extends Thread implements Runnable{
    private int delay;

    public Car(String name) {
        super(name);
    }
    public Car(String name, int delay) {
        super(name);
        this.delay = delay;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(delay);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        for (int i=0; i<50; i++){
            System.out.println("Автомобиль " + getName() + " едет " + i);
        }
    }
}
