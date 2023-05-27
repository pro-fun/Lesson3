package by.academiapvt;

public class Lion extends Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lion(String color, int lifeLongMax, String foodType, String name) {
        super(color, lifeLongMax, foodType);
        this.name = name;
    }

    @Override
    public void toMakeAVoice() {
        System.out.println("Лев " + name + " рычит");
    }
}
