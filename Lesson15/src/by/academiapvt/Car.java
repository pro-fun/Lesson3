package by.academiapvt;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private String model;
    private String generation;
    private int dateOfBuilding;

    public Car(String brand, String model, String generation, int dateOfBuilding) {
        this.brand = brand;
        this.model = model;
        this.generation = generation;
        this.dateOfBuilding = dateOfBuilding;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public int getDateOfBuilding() {
        return dateOfBuilding;
    }

    public void setDateOfBuilding(int dateOfBuilding) {
        this.dateOfBuilding = dateOfBuilding;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", generation='" + generation + '\'' +
                ", dateOfBuilding=" + dateOfBuilding +
                '}';
    }
}
