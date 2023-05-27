package by.academiapvt;

public class Dog extends Animal{
    private String name;
    private String breed;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Dog(String color, int lifeLongMax, String foodType, String name, String breed, int weight) {
        super(color, lifeLongMax, foodType);
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public void toMakeAVoice() {
        System.out.println("Собака " + name + " гавкает");
    }
}
