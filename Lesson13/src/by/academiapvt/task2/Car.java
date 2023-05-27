package by.academiapvt.task2;

public class Car implements Product {
    private String model;
    private Integer price;
    private String fullName;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Car(String model, Integer price, String fullName) {
        this.model = model;
        this.price = price;
        this.fullName = fullName;
    }

    @Override
    public Integer toSeePrice() {
        return price;
    }
}
