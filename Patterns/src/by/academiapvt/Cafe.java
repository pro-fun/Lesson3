package by.academiapvt;

import java.util.ArrayList;
import java.util.List;

public class Cafe {

    private static Cafe cafe;
    private List<CoffeeType> coffees;

    private Cafe(){ }
    public static Cafe getInstance(){
        if(cafe==null){
            cafe = new Cafe();
        }
        return cafe;
    }
    public void addCoffee(CoffeeType coffeeType){
        if (coffees == null){
            coffees = new ArrayList<>();
        }
        coffees.add(coffeeType);
    }
}
