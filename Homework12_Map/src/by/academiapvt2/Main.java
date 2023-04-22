package by.academiapvt2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Task 2.3
        Employee employee1 = new Employee(1, "Иван", "Иванов", 35);
        Employee employee2 = new Employee(2, "Сергей", "Кузнецов", 25);
        Employee employee3 = new Employee(3, "Петр", "Стрельцов", 22);
        Employee employee4 = new Employee(4, "Дмитрий", "Ворошилов", 41);
        Employee employee5 = new Employee(5, "Анна", "Ковалева", 27);
        Employee employee6 = new Employee(6, "Олег", "Дмитриев", 28);
        Employee employee7 = new Employee(7, "Светлана", "Кузнечная", 19);
        Employee employee8 = new Employee(8, "Оксана", "Яровая", 32);
//        Task 2.4
        Map<Employee, String> listOfEmployeeAsKey = new HashMap<>();
        listOfEmployeeAsKey.put(employee1, "директор");
        listOfEmployeeAsKey.put(employee2, "менеджер");
        listOfEmployeeAsKey.put(employee3, "грузчик");
        listOfEmployeeAsKey.put(employee4, "менеджер");
        listOfEmployeeAsKey.put(employee5, "продавец");
        listOfEmployeeAsKey.put(employee6, "грузчик");
        listOfEmployeeAsKey.put(employee7, "продавец");
        listOfEmployeeAsKey.put(employee8, "продавец");

//        Task 2.5
        Map<String, Collection<Employee>> listOfEmployeeAsValue = new HashMap<>();
        Set<Map.Entry<Employee, String>> list = listOfEmployeeAsKey.entrySet();
        for (Map.Entry<Employee, String> entry : list) {
            String specialization = entry.getValue();
            Employee currentEmployee = entry.getKey();
            if (listOfEmployeeAsValue.containsKey(specialization)) {
                Set<Map.Entry<String, Collection<Employee>>> list1 = listOfEmployeeAsValue.entrySet();
                for (Map.Entry<String, Collection<Employee>> newentry : list1) {
                    if (newentry.getKey().contains(specialization)) {
                        newentry.getValue().add(currentEmployee);
                    }
                }
            }
            else{
                Collection<Employee> newEmployee = new HashSet<>();
                newEmployee.add(currentEmployee);
                listOfEmployeeAsValue.put(specialization,newEmployee);
            }
        }
        information(listOfEmployeeAsValue);
    }
    public static void information(Map map){
        Set<Map.Entry<String, Collection<Employee>>> list = map.entrySet();
        for (Map.Entry<String, Collection<Employee>> entry : list){
            System.out.println(entry);
        }

    }
}


