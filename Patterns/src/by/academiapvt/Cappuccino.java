package by.academiapvt;

public class Cappuccino extends CoffeeType{
    public Cappuccino(int doseOfWater, boolean presenceOfMilk, int doseOfMilk, int doseOfSugar) {
        super(doseOfWater, presenceOfMilk, doseOfMilk, doseOfSugar);
    }

    @Override
    public void toDescribeCoffeeIngredients() {
        System.out.println("Тип кофе: Каппучино, количество воды: " + getDoseOfWater() + ", количество молока: " + getDoseOfMilk() + ", количество сахара: " + getDoseOfSugar());
    }


}
