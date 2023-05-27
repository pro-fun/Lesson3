package by.academiapvt.filter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainPatient {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {


        Patient patient1 = new Patient("Иван", "Петров", "7", "ОРВИ");
        Patient patient2 = new Patient("Сергей", "Кузнецов", "13", "Отит");
        Patient patient3 = new Patient("Степан", "Ковалёв", "4", "Язва");
        Patient patient4 = new Patient("Андрей", "Сидоров", "2", "Корь");
        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);
        Class<?> patientClass = Patient.class;
        Method[] methods = patientClass.getDeclaredMethods();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String text1 = scanner.nextLine();
        List<Patient> patients1 = new ArrayList<>();
        for (Method method : methods) {
            if (method.getName().startsWith("get" + text)) {
                patients1 = patients.stream().filter(patient -> {
                    try {
                        return method.invoke(patient).equals(text1);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }).collect(Collectors.toList());
                break;
            }
        }

        System.out.println(patients1.toString());

    }
}

