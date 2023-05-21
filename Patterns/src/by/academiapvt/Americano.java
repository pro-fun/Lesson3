package by.academiapvt;

public class Americano extends CoffeeType{
    public Americano(int doseOfWater, boolean presenceOfMilk, int doseOfMilk, int doseOfSugar) {
        super(doseOfWater, presenceOfMilk, doseOfMilk, doseOfSugar);
    }


    @Override
    public void toDescribeCoffeeIngredients() {
        System.out.println("Тип кофе: Американо, количество воды: " + getDoseOfWater() + ", количество сахара: " + getDoseOfSugar());
    }


}
