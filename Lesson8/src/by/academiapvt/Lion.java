package by.academiapvt;

public class Lion extends Animal {
    private String name;

    public Lion( String color, int lifeLongMax, String foodType, String name) {
        super(color, lifeLongMax, foodType);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + ", имя: " + name;
    }

    protected void toPlay() {
        System.out.println( "Лев " + name + " играет");
    }
    protected void toSing() {
        System.out.println("Лев " + name + " поет");
    }

}
