package by.academiapvt.task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi");
        Motorcycle motorcycle1 = new Motorcycle("Honda");
        Garage garage1 = new Garage(car1);
        Garage garage2 = new Garage(motorcycle1);
        System.out.println(garage1.toString());
        System.out.println(garage2.toString());

    }
}
