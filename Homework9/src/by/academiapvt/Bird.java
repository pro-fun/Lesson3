package by.academiapvt;

public class Bird extends Animal{
    private String family;
    private String flyHeight;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFlyHeight() {
        return flyHeight;
    }

    public void setFlyHeight(String flyHeight) {
        this.flyHeight = flyHeight;
    }

    public Bird(String color, int lifeLongMax, String foodType,String family, String flyHeight) {
        super(color, lifeLongMax, foodType);
        this.family = family;
        this.flyHeight = flyHeight;
    }

    @Override
    public void toMakeAVoice() {
        System.out.println("Птица " + family + " чирикает");
    }
}
