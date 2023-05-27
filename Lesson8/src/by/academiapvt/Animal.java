package by.academiapvt;

public class Animal {
    private String color;
    private int lifeLongMax;
    private String foodType;
    private int number;

    public String getColor() {
        return color;
    }

    public int getLifeLongMax() {
        return lifeLongMax;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLifeLongMax(int lifeLongMax) {
        this.lifeLongMax = lifeLongMax;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Animal(String color, int lifeLongMax, String foodType) {
        this.color = color;
        this.lifeLongMax = lifeLongMax;
        this.foodType = foodType;
    }

    public Animal(String color, int lifeLongMax, String foodType, int number) {
        this.color = color;
        this.lifeLongMax = lifeLongMax;
        this.foodType = foodType;
        this.number = number;
    }


    public String toString() {
        return "Номер: " + number + ", Цвет - " + color + " , продолжительность жизни - " + lifeLongMax + " , тип корма - " + foodType;
    }


    public static void main(String[] args) {
        Bird bird = new Bird("желтый", 15, "зерно", "попугай", "200м");
        bird.toPeck();
        bird.toSing();
        bird.toHatchChicks();
        Dog dog = new Dog("Белый", 18, "сухой корм", "Дик", "Алабай", 9);
        dog.toBark();
        dog.toBite();
        dog.toJump();
        dog.toPlay();
        dog.toRun();
        System.out.println(dog.toString());
        System.out.println(bird.toString());
//        ******* Task 1.3
        Zoo zoo1 = Zoo.initialize();
//        ******* Task 1.4
        zoo1.toAddABird(bird);
        zoo1.toAddADog(dog);
//        ******* Task 1.5
        Lion lion1 = new Lion("пятнистый", 22, "кролики", "Чарльз");
        Lion lion2 = new Lion("рыжий", 22, "утки", "Кинг");
        Lion lion3 = new Lion("песчаный", 19, "курица", "Африканец");
        lion2.toPlay();
        lion3.toSing();
        zoo1.toAddALion(lion1);
        zoo1.toAddALion(lion2);
        zoo1.toAddALion(lion3);
//        ******* Task 1.6
        System.out.println(zoo1.numberOfAnimals());
//        ******* Task 1.7
        zoo1.toGiveANumber();
//        ******* Task 1.8
        System.out.println(zoo1.infoAboutAnimalInTheZoo(5));
//        ******* Task 1.9
        zoo1.toDeleteAnAnimal(6);
        zoo1.infoAboutAllAnimalsInTheZoo();
    }
}
