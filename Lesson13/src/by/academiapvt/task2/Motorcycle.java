package by.academiapvt.task2;

public class Motorcycle implements Product {
    private String model;
    private Integer price;
    private double engineCapacity;

    public Motorcycle(String model, Integer price, double engineCapacity) {
        this.model = model;
        this.price = price;
        this.engineCapacity = engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public Integer toSeePrice() {
        return price;
    }
}
