package by.academiapvt;

public class Patient {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private long phonenumber;
    private int medicalcard;
    private String diagnosis;

    public Patient() {

    }

    public Patient(int id, String name, String surname, String patronymic, long phonenumber, int medicalcard, String diagnosis) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phonenumber = phonenumber;
        this.medicalcard = medicalcard;
        this.diagnosis = diagnosis;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getMedicalcard() {
        return medicalcard;
    }

    public void setMedicalcard(int medicalcard) {
        this.medicalcard = medicalcard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String information() {
        return "id - " + id + ", Имя - " + name + ", Фамилия - " + patronymic + ", Отчество - " + surname + ", номер телефона - "
                + phonenumber + ", Медицинская карта - " + medicalcard + ", Диагноз - " + diagnosis;
    }

    public static Patient[] initialize() {
        Patient[] patients = new Patient[8];
        patients[0] = new Patient(1, "Евгений", "Сидоров", "Петрович", 292929292, 112, "ОРВИ");
        patients[1] = new Patient(2, "Дмитрий", "Иванов", "Сергеевич", 333333333, 113, "Оспа");
        patients[2] = new Patient(3, "Александр", "Третьяков", "Алексеевич", 291234567, 114, "Ковид");
        patients[3] = new Patient(4, "Сергей", "Петров", "Владимирович", 447654321, 115, "Аллергия");
        patients[4] = new Patient(5, "Олег", "Кузнецов", "Геннадьевич", 123456789, 116, "ОРВИ");
        patients[5] = new Patient(6, "Алексей", "Березин", "Юрьевич", 337654321, 117, "Пневмония");
        patients[6] = new Patient(7, "Руслан", "Рыбаков", "Николаевич", 291000001, 118, "Диарея");
        patients[7] = new Patient(8, "Иван", "Андреев", "Анатольевич", 334567890, 119, "Пневмония");
        return patients;
    }

}
