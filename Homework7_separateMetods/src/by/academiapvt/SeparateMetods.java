package by.academiapvt;


public class SeparateMetods {
    public static void main(String[] args) {
        String text = "Да1та выпуска 8 декабря 1998 года[12]. Кодовое имя Playground. В данном случае встречается путаница.\n" +
                "Выпускались книги, например, Beginning Java 2 by Ivor Horton (Mar 1999), фактически по J2SE 1.2 (бывшее название — Java 2).\n" +
                "Вместе с тем по сей день такие книги публикуются, например: Х. М. Дейтел, П. Дж. Дейтел, С. И. Сантри.\n" +
                "Технологии программирования на Java 2. Распределённые приложения (2011).\n" +
                "В то время, когда, как известно, Java 2 была исторически заменена следующими релизами, подобные названия книг дезориентируют в понимании,\n" +
                "о какой же версии Java они написаны на самом деле. Если J2SE 1.2 принято считать за Java 2, а авторы книг за Java 2 принимают JDK 7, это приводит к полной путанице.";

        Redactor(text, "[\\p{Punct}\\d]");
    }

    public static String[] Redactor(String text, String regExp) {
        String[] newText = text.split(regExp);
        for (String next : newText) {
            System.out.print(next);
        }
        return newText;
    }
}


