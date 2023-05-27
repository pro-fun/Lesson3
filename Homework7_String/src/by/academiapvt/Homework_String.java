package by.academiapvt;

import java.util.Arrays;

public class Homework_String {
    public static void main(String[] args) {
        String text = "Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) или " +
                "метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String " +
                "являетсято, что его значение не может быть изменено после создания объекта при помощилюбого метода класса." +
                " Изменение строки всегда приводит к созданию новогообъекта в heap. Сама объектная ссылка при этом сохраняет" +
                " прежнее значениеи хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";
        String textToPast = " - Здесь вставлен кусок текста - ";
        String divider = "та ";
        String insertedWord = " МЕНЯСЮДАВСТАВИЛИ ";

//        Task 2
        task2(text, textToPast, 25);

//        Task 3
        task3(text, divider, insertedWord);


    }

    static String task2(String text, String textToPast, int cutnumber) {
        String firstpart = text.substring(0, cutnumber);
        String secondpart = text.substring(cutnumber);
        String textToReturn = firstpart + textToPast + secondpart;
        System.out.println(textToReturn);
        return textToReturn;
    }

    static String task3(String text, String divider, String insertedWord) {

        var newText = "";
        String[] dividedText = text.split(divider);
        int i = 0;
        for (i = 0; i < (dividedText.length - 1); i++) {
            newText = newText + dividedText[i] + divider + insertedWord;
        }
        newText = newText + dividedText[i];
        System.out.println(newText);

        return newText;


    }
}
