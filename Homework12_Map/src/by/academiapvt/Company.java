package by.academiapvt;

import java.util.Objects;

public class Company {
    private String name;
    private String fieldOfActivity;
    private int idNumber;
    private double taxDebts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldOfActivity() {
        return fieldOfActivity;
    }

    public void setFieldOfActivity(String fieldOfActivity) {
        this.fieldOfActivity = fieldOfActivity;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getTaxDebts() {
        return taxDebts;
    }

    public void setTaxDebts(double taxDebts) {
        this.taxDebts = taxDebts;
    }

    public Company(String name, String fieldOfActivity, int idNumber, double taxDebts) {
        this.name = name;
        this.fieldOfActivity = fieldOfActivity;
        this.idNumber = idNumber;
        this.taxDebts = taxDebts;
    }
    public void toPayTaxes(double payment){
        double i = getTaxDebts() - payment;
        setTaxDebts(i);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return idNumber == company.idNumber && name.equals(company.name) && fieldOfActivity.equals(company.fieldOfActivity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fieldOfActivity, idNumber);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", fieldOfActivity='" + fieldOfActivity + '\'' +
                ", idNumber=" + idNumber +
                ", taxDebts=" + taxDebts +
                '}' + "\n";
    }
}
