package by.academiapvt.filter;

public class Patient {
    private String name;
    private String surname;
    private String numberOfRoom;
    private String diagnosis;

    public Patient(String name, String surname, String numberOfRoom, String diagnosis) {
        this.name = name;
        this.surname = surname;
        this.numberOfRoom = numberOfRoom;
        this.diagnosis = diagnosis;
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

    public String getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(String numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberOfRoom='" + numberOfRoom + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
