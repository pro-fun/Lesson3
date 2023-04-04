package by.academiapvt;

public abstract class Animal {
    private String color;
    private int lifeLongMax;
    private String foodType;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLifeLongMax() {
        return lifeLongMax;
    }

    public void setLifeLongMax(int lifeLongMax) {
        this.lifeLongMax = lifeLongMax;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }


    public Animal( String color, int lifeLongMax, String foodType) {
        this.color = color;
        this.lifeLongMax = lifeLongMax;
        this.foodType = foodType;
    }

    public Animal() {
    }
    public abstract void toMakeAVoice();

}
