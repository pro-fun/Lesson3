package by.academiapvt;

public class Main {
    public static void main(String[] args) {
//        Task 1.1
        Car car1 = new Car("Porsche");
        Car car2 = new Car("Audi");
        car1.start();
        car2.start();
//        Task 1.2
        Car car3 = new Car("BMW", 100);
        Car car4 = new Car("VW", 110);
        car3.start();
        car4.start();
//        Task 1.3
        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);
        Thread thread4 = new Thread(car4);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
//        Task 1.4
        Car car5 = new Car("Kia");
        carWithJoin(car1, car2, car5);
//        Task 2
        ThreadForRandomMaths thread11 = new ThreadForRandomMaths("1й поток");
        ThreadForRandomMaths thread12 = new ThreadForRandomMaths("2й поток");
        ThreadForRandomMaths thread13 = new ThreadForRandomMaths("3й поток");
        ThreadForRandomMaths thread14 = new ThreadForRandomMaths("4й поток");
        ThreadForRandomMaths thread15 = new ThreadForRandomMaths("5й поток");
        ThreadForRandomMaths thread16 = new ThreadForRandomMaths("6й поток");
        ThreadForRandomMaths thread17 = new ThreadForRandomMaths("7й поток");
        ThreadForRandomMaths thread18 = new ThreadForRandomMaths("8й поток");
        ThreadForRandomMaths thread19 = new ThreadForRandomMaths("9й поток");
        ThreadForRandomMaths thread20 = new ThreadForRandomMaths("10й поток");
        thread11.start();
        thread12.start();
        thread13.start();
        thread14.start();
        thread15.start();
        thread16.start();
        thread17.start();
        thread18.start();
        thread19.start();
        thread20.start();
    }

    static void carWithJoin(Car firstCar, Car secondCar, Car thirdCar) {
        try {
            firstCar.start();
            firstCar.join();
            secondCar.start();
            thirdCar.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
