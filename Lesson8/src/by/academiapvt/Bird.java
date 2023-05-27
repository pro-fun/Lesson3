package by.academiapvt;

public class Bird extends Animal {
    private String family;
    private String flyHeight;


    public Bird(String color, int lifeLongMax, String foodType, String family, String flyHeight) {
        super(color, lifeLongMax, foodType);
        this.family = family;
        this.flyHeight = flyHeight;
    }


    public String getFamily() {
        return family;
    }

    public String getFlyHeight() {
        return flyHeight;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setFlyHeight(String flyHeight) {
        this.flyHeight = flyHeight;
    }

    protected void toSing() {
        System.out.println(family + " поет");
    }

    protected void toPeck() {
        System.out.println(family + " клюет");
    }

    protected void toHatchChicks() {
        System.out.println(family + " высиживает птенцов");
    }

    public String toString() {
        return super.toString() + " , семейство - " + family + " , высота полета - " + flyHeight;

    }
}
