package by.academiapvt.task3;

public class Garage <T extends Vehicle> {
    T vehicle;
    public Garage (T t){
        vehicle=t;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "vehicle=" + vehicle +
                '}';
    }
}
