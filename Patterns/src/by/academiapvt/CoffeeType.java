package by.academiapvt;

public abstract class CoffeeType {
    private int doseOfWater;
    private boolean presenceOfMilk;
    private int doseOfMilk;
    private int doseOfSugar;

    public int getDoseOfWater() {
        return doseOfWater;
    }

    public void setDoseOfWater(int doseOfWater) {
        this.doseOfWater = doseOfWater;
    }

    public boolean isPresenceOfMilk() {
        return presenceOfMilk;
    }

    public void setPresenceOfMilk(boolean presenceOfMilk) {
        this.presenceOfMilk = presenceOfMilk;
    }

    public int getDoseOfMilk() {
        return doseOfMilk;
    }

    public void setDoseOfMilk(int doseOfMilk) {
        this.doseOfMilk = doseOfMilk;
    }

    public int getDoseOfSugar() {
        return doseOfSugar;
    }

    public void setDoseOfSugar(int doseOfSugar) {
        this.doseOfSugar = doseOfSugar;
    }

    public CoffeeType(int doseOfWater, boolean presenceOfMilk, int doseOfMilk, int doseOfSugar) {
        this.doseOfWater = doseOfWater;
        this.presenceOfMilk = presenceOfMilk;
        this.doseOfMilk = doseOfMilk;
        this.doseOfSugar = doseOfSugar;
    }


    public abstract void toDescribeCoffeeIngredients();
}
