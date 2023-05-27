package by.academiapvt.task2;

public class MainAutoClass {
    public static void main(String[] args) {
        Car car = new Car("Audi", 15000, "A3");
        Motorcycle motorcycle = new Motorcycle("Yamaha",14000, 1600);
        ComparingProducts<Car, Motorcycle> comparingProducts = new ComparingProducts<>(car,motorcycle);
        comparingProducts.toCompareProducts(car,motorcycle);
    }

}
