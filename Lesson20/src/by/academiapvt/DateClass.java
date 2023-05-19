package by.academiapvt;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateClass {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(" GGGG qqqq EEEE dd MMM yyyy', время:' HH:mm:ss");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern(" GGGG qqqq EEEE dd MMM yyyy', время:' HH:mm:ss a");
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1.format(dateTimeFormatter));
        System.out.println(localDateTime1.format(dateTimeFormatter1));
    }
}
