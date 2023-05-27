package by.academiapvt;


public class Zoo {
    private Bird[] birds;
    private Dog[] dogs;
    private Lion[] lions;

    public Lion[] getLions() {
        return lions;
    }

    public void setLions(Lion[] lions) {
        this.lions = lions;
    }

    public Bird[] getBirds() {
        return birds;
    }

    public void setBirds(Bird[] birds) {
        this.birds = birds;
    }

    public Dog[] getDogs() {
        return dogs;
    }

    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }


    public Zoo(Bird[] birds, Dog[] dogs, Lion[] lions) {
        this.birds = birds;
        this.dogs = dogs;
        this.lions = lions;
    }

    public static Zoo initialize() {
        Bird[] birds = new Bird[3];
        birds[0] = new Bird("серый", 12, "мыши", "сова", "450м");
        birds[1] = new Bird("желтый", 9, "зерно", "попугай", "200м");
        birds[2] = new Bird("черный", 7, "черви", "ворон", "150м");
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("белый", 16, "Роял Канин", "Джек", "Хаски", 20);
        dogs[1] = new Dog("серый", 14, "Педигри", "Шарик", "Овчарка", 12);
        dogs[2] = new Dog("черный", 15, "Хиллс", "Бобик", "Пудель", 9);
        Lion[] lions = new Lion[0];
        Zoo zoo = new Zoo(birds, dogs, lions);
        return zoo;
    }

    public Zoo toAddABird(Bird bird) {

        Bird[] bird1 = getBirds();
        int numberOfBirds = bird1.length;
        if (numberOfBirds == 0) {
            bird1 = new Bird[1];
            bird1[0] = bird;
        } else {
            Bird[] newBirds = new Bird[numberOfBirds + 1];
            for (int i = 0; i < numberOfBirds + 1; i++) {
                if (i != numberOfBirds) {
                    newBirds[i] = bird1[i];
                } else {
                    newBirds[i] = bird;
                }
            }
            bird1 = newBirds;
        }
        setBirds(bird1);
        return null;
    }

    public Zoo toAddADog(Dog dog) {

        Dog[] dog1 = getDogs();
        int numberOfDogs = dog1.length;
        if (numberOfDogs == 0) {
            dog1 = new Dog[1];
            dog1[0] = dog;
        } else {
            Dog[] newDogs = new Dog[numberOfDogs + 1];
            for (int i = 0; i < numberOfDogs + 1; i++) {
                if (i != numberOfDogs) {
                    newDogs[i] = dog1[i];
                } else {
                    newDogs[i] = dog;
                }
            }
            dog1 = newDogs;
        }
        setDogs(dog1);
        return null;
    }

    public Zoo toAddALion(Lion lion) {

        Lion[] lion1 = getLions();
        int numberOfLions = lion1.length;
        if (numberOfLions == 0) {
            lion1 = new Lion[1];
            lion1[0] = lion;
        } else {
            Lion[] newLions = new Lion[numberOfLions + 1];
            for (int i = 0; i < numberOfLions + 1; i++) {
                if (i != numberOfLions) {
                    newLions[i] = lion1[i];
                } else {
                    newLions[i] = lion;
                }
            }
            lion1 = newLions;
        }
        setLions(lion1);
        return null;
    }

    public int numberOfAnimals() {
        int i = 0;
        Lion[] lion1 = getLions();
        Dog[] dog1 = getDogs();
        Bird[] bird1 = getBirds();
        i = lion1.length + dog1.length + bird1.length;
        return i;
    }

    public Zoo toGiveANumber() {
        Lion[] lion1 = getLions();
        Dog[] dog1 = getDogs();
        Bird[] bird1 = getBirds();
        int i = 1;
        if (lion1.length != 0) {
            for (int j = 0; j < lion1.length; j++) {
                lion1[j].setNumber(i);
                i++;
            }
        } else i = 1;

        if (dog1.length != 0) {
            for (int j = 0; j < dog1.length; j++) {
                dog1[j].setNumber(i);
                i++;
            }
        } else i = 1;
        if (bird1.length != 0) {
            for (int j = 0; j < bird1.length; j++) {
                bird1[j].setNumber(i);
                i++;
            }
        } else i = 0;
        return null;
    }

    public String infoAboutAnimalInTheZoo(int i) {

        Bird[] bird1 = getBirds();
        Dog[] dog1 = getDogs();
        Lion[] lion1 = getLions();
        String AnimalInfo = null;
        int animalsInZoo = bird1.length + dog1.length + lion1.length;
        if ((i < 1) || (i > animalsInZoo)) AnimalInfo = "Такого номера животного нет в списке";
        else
            for (int j = 0; j < bird1.length; j++) {
                if (bird1[j].getNumber() == i) {
                    AnimalInfo = bird1[j].toString();
                }
            }
        for (int j = 0; j < dog1.length; j++) {
            if (dog1[j].getNumber() == i) {
                AnimalInfo = dog1[j].toString();
            }
        }
        for (int j = 0; j < lion1.length; j++) {
            if (lion1[j].getNumber() == i) {
                AnimalInfo = lion1[j].toString();
            }
        }
        return AnimalInfo;
    }

    public void toDeleteAnAnimal(int i) {

        Bird[] bird1 = getBirds();
        Dog[] dog1 = getDogs();
        Lion[] lion1 = getLions();
        String AnimalInfo = null;
        int animalsInZoo = bird1.length + dog1.length + lion1.length;
        if ((i < 1) || (i > animalsInZoo)) AnimalInfo = "Такого номера животного нет в списке";
        else
            for (int j = 0; j < bird1.length; j++) {
                if (bird1[j].getNumber() == i) {
                    bird1[j] = null;
                }
            }
        for (int j = 0; j < dog1.length; j++) {
            if (dog1[j].getNumber() == i) {
                dog1[j] = null;
            }
        }
        for (int j = 0; j < lion1.length; j++) {
            if (lion1[j].getNumber() == i) {
                lion1[j] = null;
            }
        }
    }

    public void infoAboutAllAnimalsInTheZoo() {

        Bird[] bird1 = getBirds();
        Dog[] dog1 = getDogs();
        Lion[] lion1 = getLions();
        System.out.println("Полный список животных по присутствующим номерам:");
        for (Lion lion : lion1) {
            if (lion != null) System.out.println(lion.toString());
        }
        for (Dog dog : dog1) {
            if (dog != null) System.out.println(dog.toString());
        }
        for (Bird bird : bird1) {
            if (bird != null) System.out.println(bird.toString());
        }
    }
}
