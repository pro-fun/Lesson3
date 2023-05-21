package by.academiapvt;

public class CoffeeHouse implements CoffeeFactory{

    @Override
    public CoffeeType createCoffee(Coffee coffee, int doseOfWater,int doseOfMilk, int doseOfSugar) {
        CoffeeType coffeeType=null;
        Cafe cafe = Cafe.getInstance();
        if (coffee.equals(Coffee.LATTE)){
            boolean presenceOfMilk = true;
            coffeeType = new Latte(doseOfWater,presenceOfMilk,doseOfMilk,doseOfSugar);
        } else if (coffee.equals(Coffee.CAPPUCCINO)) {
            boolean presenceOfMilk = true;
            coffeeType = new Cappuccino(doseOfWater,presenceOfMilk,doseOfMilk,doseOfSugar);
        } else if (coffee.equals(Coffee.ESPRESSO)) {
            boolean presenceOfMilk = false;
            coffeeType = new Espresso(doseOfWater,presenceOfMilk,doseOfMilk,doseOfSugar);
        } else if (coffee.equals(Coffee.AMERICANO)) {
            boolean presenceOfMilk = false;
            coffeeType = new Americano(doseOfWater,presenceOfMilk,doseOfMilk,doseOfSugar);
        }
        cafe.addCoffee(coffeeType);
        return coffeeType;
    }
}
