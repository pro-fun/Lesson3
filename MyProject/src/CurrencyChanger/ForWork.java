package CurrencyChanger;

import CurrencyChanger.constants.Currencies;
import CurrencyChanger.domain.ChangeCurrency;

import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForWork {
    public static void main(String[] args) {
//        List<ChangeCurrency> changeCurrencies = new ArrayList<>();
//        ChangeCurrency changeCurrency1 = new ChangeCurrency(Currencies.BYN,Currencies.USD,2.93);
//        ChangeCurrency changeCurrency2 = new ChangeCurrency(Currencies.BYN,Currencies.EUR,3.18);
//        ChangeCurrency changeCurrency3 = new ChangeCurrency(Currencies.BYN,Currencies.RUB,0.0365);
//        ChangeCurrency changeCurrency4 = new ChangeCurrency(Currencies.USD,Currencies.BYN,0.34);
//        ChangeCurrency changeCurrency5 = new ChangeCurrency(Currencies.USD,Currencies.EUR,1.08);
//        ChangeCurrency changeCurrency6 = new ChangeCurrency(Currencies.USD,Currencies.RUB,0.0124);
//        ChangeCurrency changeCurrency7 = new ChangeCurrency(Currencies.EUR,Currencies.BYN,0.314);
//        ChangeCurrency changeCurrency8 = new ChangeCurrency(Currencies.EUR,Currencies.USD,0.924);
//        ChangeCurrency changeCurrency9 = new ChangeCurrency(Currencies.EUR,Currencies.RUB,0.0115);
//        ChangeCurrency changeCurrency10 = new ChangeCurrency(Currencies.RUB,Currencies.BYN,27.38);
//        ChangeCurrency changeCurrency11 = new ChangeCurrency(Currencies.RUB,Currencies.USD,80.4);
//        ChangeCurrency changeCurrency12 = new ChangeCurrency(Currencies.RUB,Currencies.EUR,87.06);
//        changeCurrencies.add(changeCurrency1);
//        changeCurrencies.add(changeCurrency2);
//        changeCurrencies.add(changeCurrency3);
//        changeCurrencies.add(changeCurrency4);
//        changeCurrencies.add(changeCurrency5);
//        changeCurrencies.add(changeCurrency6);
//        changeCurrencies.add(changeCurrency7);
//        changeCurrencies.add(changeCurrency8);
//        changeCurrencies.add(changeCurrency9);
//        changeCurrencies.add(changeCurrency10);
//        changeCurrencies.add(changeCurrency11);
//        changeCurrencies.add(changeCurrency12);
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("documents/changecurrencies"))) {
//            objectOutputStream.writeObject(changeCurrencies);
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }
//        System.out.println("ok");

//        localDateTime.isAfter(instant)
//        System.currentTimeMillis();
//        System.out.println(System.currentTimeMillis());
//        ZoneOffset zoneOffset = null;
//        localDateTime.toEpochSecond(zoneOffset)

        File file1 = new File("documents\\newcurrencies.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                System.out.println(text);
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
