package by.academiapvt;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainAnnotation {
    public static void main(String[] args) {
        ClassForYear classForYear = new ClassForYear();
        Class<?> yearClass = ClassForYear.class;
        Method[] methods = yearClass.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation: annotations) {
                if (annotation instanceof AcademyInfo){
                    AcademyInfo annotation1 = (AcademyInfo) annotation;
                    String year = annotation1.year();
                    System.out.println(year);
                }
            }

            if (method.isAnnotationPresent(AcademyInfo.class)) {
                try {
                    method.setAccessible(true);
                    method.invoke(classForYear);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
