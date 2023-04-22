package by.academiapvt2;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int age;

    public Employee(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}' + "\n";
    }
}
