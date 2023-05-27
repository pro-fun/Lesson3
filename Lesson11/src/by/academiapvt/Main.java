package by.academiapvt;

public class Main {
    public static void main(String[] args) {
//          Task 1.1
        Student student1 = new Student("Андрей", "Петров", "12.01.95", "Барановичи", 5.3);
        Student student2 = new Student("Сергей", "Кузнецов", "18.11.99", "Гомель", 6.7);
        Student student3 = new Student("Алексей", "Ковалев", "03.02.02", "Минск", 5.6);
        Student student4 = new Student("Дмитрий", "Антонов", "01.01.03", "Витебск", 5.8);
        Student student5 = new Student("Евгений", "Третьяков", "24.07.93", "Пуховичи", 3.4);
        Student student6 = new Student("Владимир", "Киселев", "17.06.00", "Пинск", 5.5);
        Student student7 = new Student("Петр", "Гончаров", "12.10.97", "Гомель", 3.9);
        Student student8 = new Student("Степан", "Белоусов", "02.03.92", "Гродно", 7.2);
        Student student9 = new Student("Антон", "Кудрявцев", "08.01.90", "Минск", 8.1);
//          Task 1.2
        Group group1 = new Group("G1");
        Group group2 = new Group("G2");
        Group group3 = new Group("G3");
        group1.toAddStudentInGroup(student1);
        group1.toAddStudentInGroup(student2);
        group1.toAddStudentInGroup(student3);
        group1.toAddStudentInGroup(student4);
        group2.toAddStudentInGroup(student5);
        group2.toAddStudentInGroup(student6);
        group3.toAddStudentInGroup(student7);
        group3.toAddStudentInGroup(student8);
        group3.toAddStudentInGroup(student9);
//          Task 1.3
        Faculty faculty = new Faculty("Физико-математический");
        faculty.toAddGroupAtTheFaculty(group1);
        faculty.toAddGroupAtTheFaculty(group2);
        faculty.toAddGroupAtTheFaculty(group3);
//          Task 1.4
        group3.toCheckPerformance(4);
        System.out.println(group3.getStudentsForGroup());
//          Task 1.5
        System.out.println("*************************");
        group2.toCheckNumberOfStudentsInTheGroup(3, group1, faculty);
        System.out.println(group1.getStudentsForGroup());
//        Task 1.7
        faculty.toChangeActivity();
        System.out.println(faculty.getIfItsActive());
        faculty.toChangeActivity();
        System.out.println(faculty.getIfItsActive());
//        Task 1.8
        System.out.println("*************************");
        faculty.toCheckNumberOfStudents();
//        Task 1.9
        System.out.println("*************************");
        group3.toCountAverageMark();
//        Task 1.10
        System.out.println("*************************");
        group1.toSortStudentsByEvaluationLowFirst();
//        Task 1.11
        System.out.println("*************************");
        group3.toSortStudentsByEvaluationHighFirst();

    }

}