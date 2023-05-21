package by.academiapvt;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = Cafe.getInstance();
        CoffeeFactory coffeeFactory = new CoffeeHouse();
        CoffeeType coffeeType = coffeeFactory.createCoffee(Coffee.LATTE, 30, 250, 20 );
        CoffeeType coffeeType1 = coffeeFactory.createCoffee(Coffee.AMERICANO, 40, 0, 0);
        CoffeeType coffeeType2 = coffeeFactory.createCoffee(Coffee.CAPPUCCINO, 30, 150, 10);
        CoffeeType coffeeType3 = coffeeFactory.createCoffee(Coffee.ESPRESSO, 20, 0, 10);
        coffeeType.toDescribeCoffeeIngredients();
        coffeeType1.toDescribeCoffeeIngredients();
        coffeeType2.toDescribeCoffeeIngredients();
        coffeeType3.toDescribeCoffeeIngredients();


    }
}
