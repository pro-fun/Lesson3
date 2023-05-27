package by.academiapvt;

public class Patient {
    private int id;
    private String name;
    private String surname;
    private String diagnosis;
    private int age;
    private Sex sex;

    public Patient(int id, String name, String surname, String diagnosis, int age, Sex sex) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.age = age;
        this.sex = sex;
    }

    public Patient() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
