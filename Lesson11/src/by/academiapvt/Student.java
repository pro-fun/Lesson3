package by.academiapvt;

public class Student {
    private String name;
    private String surname;
    private String birthday;
    private String nativeCity;
    private double  evaluation;

    public Student(String name, String surname, String birthday, String nativeCity, double evaluation) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.nativeCity = nativeCity;
        this.evaluation = evaluation;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNativeCity() {
        return nativeCity;
    }

    public void setNativeCity(String nativeCity) {
        this.nativeCity = nativeCity;
    }

    public void setEvaluation(double evaluation) {
        this.evaluation = evaluation;
    }

    public double getEvaluation() {
        return evaluation;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", nativeCity='" + nativeCity + '\'' +
                ", evaluation=" + evaluation +
                '}';
    }
}
