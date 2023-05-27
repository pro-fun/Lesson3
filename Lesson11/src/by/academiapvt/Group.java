package by.academiapvt;

import java.util.*;

public class Group {
    private String groupNumber;
    private List studentsForGroup = new ArrayList();


    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List getStudentsForGroup() {
        return studentsForGroup;
    }

    public void setStudentsForGroup(List studentsForGroup) {
        this.studentsForGroup = studentsForGroup;
    }

    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void toAddStudentInGroup(Student student) {
        studentsForGroup.add(student);
    }

    public void toCheckPerformance(double neededEvaluation) {
        getStudentsForGroup();
        Student[] students = new Student[studentsForGroup.size()];
        studentsForGroup.toArray(students);
        List goodStudents = new ArrayList();
        for (Student student : students) {
            if (student.getEvaluation() >= neededEvaluation) goodStudents.add(student);
        }
        setStudentsForGroup(goodStudents);
    }

    public void toCheckNumberOfStudentsInTheGroup(int numberOfStudents, Group newGroup, Faculty faculty) {
        Student[] students = new Student[studentsForGroup.size()];
        studentsForGroup.toArray(students);
        if (studentsForGroup.size() < numberOfStudents) {
            for (Student student : students) {
                newGroup.toAddStudentInGroup(student);
            }
            studentsForGroup.clear();
        }
        Group group = new Group(getGroupNumber());
        List currentGroupList = faculty.getGroupList();
        if (faculty.getGroupList().contains(group) == true) {
            currentGroupList.remove(group);
            faculty.setGroupList(currentGroupList);
        } else System.out.println("В группе студентов не менее " + numberOfStudents);
    }

    public void toCountAverageMark() {
        Student[] students = new Student[studentsForGroup.size()];
        studentsForGroup.toArray(students);
        double averageMark = 0;
        for (Student student : students) {
            averageMark = averageMark + student.getEvaluation();
        }
        System.out.println(averageMark / studentsForGroup.size());
    }

    public void toSortStudentsByEvaluationLowFirst() {
        Student[] students = new Student[studentsForGroup.size()];
        studentsForGroup.toArray(students);
        Student studentForSort = new Student();
        for (int n = 0; n < students.length; n++) {
            for (int k = 0; k < students.length; k++) {
                if (students[k].getEvaluation() > students[n].getEvaluation()) {
                    studentForSort = students[n];
                    students[n] = students[k];
                    students[k] = studentForSort;
                }
            }
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(groupNumber, group.groupNumber);
    }

    public void toSortStudentsByEvaluationHighFirst() {
        Student[] students = new Student[studentsForGroup.size()];
        studentsForGroup.toArray(students);
        Student studentForSort = new Student();
        for (int n = 0; n < students.length; n++) {
            for (int k = 0; k < students.length; k++) {
                if (students[k].getEvaluation() < students[n].getEvaluation()) {
                    studentForSort = students[n];
                    students[n] = students[k];
                    students[k] = studentForSort;
                }
            }
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
