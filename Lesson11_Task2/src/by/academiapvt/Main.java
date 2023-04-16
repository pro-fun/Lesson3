package by.academiapvt;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(12, "Сергей", "Иванов", "язва", 45, Sex.MALE);
        Patient patient2 = new Patient(15, "Дмитрий", "Кузнецов", "гастрит", 45, Sex.MALE);
        Patient patient3 = new Patient(7, "Светлана", "Емельянова", "гастрит", 45, Sex.FEMALE);
        Patient patient4 = new Patient(13, "Антон", "Ковалев", "цирроз", 45, Sex.MALE);
        Patient patient5 = new Patient(4, "Екатерина", "Некрасова", "гастрит", 45, Sex.FEMALE);
        Patient patient6 = new Patient(8, "Татьяна", "Волкова", "цирроз", 45, Sex.FEMALE);
        Patient patient7 = new Patient(25, "Владимир", "Тихонов", "язва", 45, Sex.MALE);
        Patient patient8 = new Patient(1, "Яна", "Симонова", "цирроз", 45, Sex.FEMALE);
        Patient patient9 = new Patient(27, "Алексей", "Зайцев", "язва", 45, Sex.MALE);
        Ward ward1 = new Ward(1, Sex.FEMALE);
        Ward ward2 = new Ward(2, Sex.FEMALE);
        Ward ward3 = new Ward(3, Sex.MALE);
        Ward ward4 = new Ward(4,Sex.MALE);
        Department department = new Department("Гастроэнтерология");
        department.toAddWardInTheDepartment(ward1);
        department.toAddWardInTheDepartment(ward2);
        department.toAddWardInTheDepartment(ward3);
        department.toAddWardInTheDepartment(ward4);
        ward1.toAddPatientInTheWard(patient3);
        ward1.toAddPatientInTheWard(patient5);
        ward1.toAddPatientInTheWard(patient6);
        ward2.toAddPatientInTheWard(patient8);
        ward3.toAddPatientInTheWard(patient1);
        ward3.toAddPatientInTheWard(patient2);
        ward3.toAddPatientInTheWard(patient4);
        ward4.toAddPatientInTheWard(patient7);
        ward4.toAddPatientInTheWard(patient9);
//        Task 2.5
        ward1.toSortPatientsById();
        System.out.println(ward1.getListOfPatients());
//        Task 2.6
        department.toCountMaleAndFemale();
//        Task 2.7
        Patient patient10= new Patient(31, "Петр", "Сергеев", "язва", 42, Sex.MALE);
        Patient patient11 = new Patient(32, "Анна", "Большова", "язва", 35, Sex.FEMALE);
        ward2.toAddPatientByDiagnosis(patient10,"язва");
        ward3.toAddPatientByDiagnosis(patient11,"язва");
        System.out.println(ward3.getListOfPatients());



    }



}
