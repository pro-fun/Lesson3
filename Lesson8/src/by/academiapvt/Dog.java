package by.academiapvt;

public class Dog extends Animal {
    private String name;
    private String breed;
    private int weight;

    public Dog(String color, int lifeLongMax, String foodType, String name, String breed, int weight) {
        super(color, lifeLongMax, foodType);
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    protected void toBark() {
        System.out.println(name + " лает");
    }

    ;

    protected void toBite() {
        System.out.println(name + " кусает");
    }

    ;

    protected void toRun() {
        System.out.println(name + " бегает");
    }

    ;

    protected void toPlay() {
        System.out.println(name + " играет");
    }

    protected void toJump() {
        System.out.println(name + " прыгает");
    }

    public String toString() {
        return super.toString() + " , Имя - " + name + " , порода - " + breed + " , вес - " + weight;
    }


}
