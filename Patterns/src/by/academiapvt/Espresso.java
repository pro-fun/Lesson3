package by.academiapvt;

public class Espresso extends CoffeeType{
    public Espresso(int doseOfWater, boolean presenceOfMilk, int doseOfMilk, int doseOfSugar) {
        super(doseOfWater, presenceOfMilk, doseOfMilk, doseOfSugar);
    }

    @Override
    public void toDescribeCoffeeIngredients() {
        System.out.println("Тип кофе: Эспрессо, количество воды: " + getDoseOfWater() + ", количество сахара: " + getDoseOfSugar());
    }


}
