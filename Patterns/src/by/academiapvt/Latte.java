package by.academiapvt;

public class Latte extends CoffeeType {
    public Latte(int doseOfWater, boolean presenceOfMilk, int doseOfMilk, int doseOfSugar) {
        super(doseOfWater, presenceOfMilk, doseOfMilk, doseOfSugar);
    }

    @Override

    public void toDescribeCoffeeIngredients() {
        System.out.println("Тип кофе: Латте, количество воды: " + getDoseOfWater() + ", количество молока: " + getDoseOfMilk() + ", количество сахара: " + getDoseOfSugar());
    }
}



