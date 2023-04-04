package by.academiapvt;

public class Main {
    public static void main(String[] args) {


        Animal animal1 = new Dog("Белый", 18, "сухой корм", "Дик", "Алабай", 9);
        Animal animal2 = new Bird("желтый", 15, "зерно", "попугай", "200м");
        Animal animal3 = new Lion("пятнистый", 22, "кролики", "Чарльз");
        Animal[] animals = new Animal[]{animal1, animal2, animal3};
        Zoo zoo = new Zoo(animals);
        zoo.voiceOfEveryAnimal();
    }
}
