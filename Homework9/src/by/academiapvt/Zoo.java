package by.academiapvt;

public class Zoo {
    private Animal[] animals;

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }
    public void voiceOfEveryAnimal(){
       for (Animal animal: animals){
           animal.toMakeAVoice();
       }
    }
}
