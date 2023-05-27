package CurrencyChanger.repository;

import CurrencyChanger.constants.Currencies;
import CurrencyChanger.domain.ChangeCurrency;
import CurrencyChanger.exception.AccountException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CurrencyRepository extends FileWorker {
    public static List<ChangeCurrency> changeCurrencies = new ArrayList<>();
    public static String PATH = "documents/changecurrencies";

    public List<ChangeCurrency> allChangeCurrencies() {
        Object object = deserializeObject(PATH);
        List<ChangeCurrency> changeCurrencies = new ArrayList<>();
        if ((object instanceof List<?>)) {
            changeCurrencies = (List<ChangeCurrency>) object;
        }
        return changeCurrencies;
    }
    public List<ChangeCurrency> updateCurrencies() {
        Object object = deserializeObject(PATH);
        if ((object instanceof List<?>)) {
            changeCurrencies = (List<ChangeCurrency>) object;
        }
        return changeCurrencies;
    }
    public Double getCurrency(Currencies currencies1, Currencies currencies2){
        updateCurrencies();
        List<ChangeCurrency> currencies = changeCurrencies.stream().filter(changeCurrency1 -> changeCurrency1.getCurrencyToChange().equals(currencies1)).collect(Collectors.toList());
        ChangeCurrency currency = currencies.stream().filter(changeCurrency1 -> changeCurrency1.getCurrencyToReceive().equals(currencies2)).findFirst().orElseThrow(()->new AccountException("Курс обмена не найден"));
        return currency.getValue();
    }
    public void downloadChangeCurrencies(){
        List<ChangeCurrency> changeCurrencies = updateCurrencies();
        File file1 = new File("documents\\newcurrencies.txt");
        changeCurrencies.stream().forEach(changeCurrency -> {
            String currency = changeCurrency.getCurrencyToChange().toString()+changeCurrency.getCurrencyToReceive().toString();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
                String text;
                while ((text = bufferedReader.readLine()) != null) {
                    if (text.startsWith(currency)) {
                        var neededCurrency = Double.parseDouble(String.valueOf(text.substring(6)));
                        changeCurrency.setValue(neededCurrency);
                    }
                }
            } catch (Throwable e) {
                e.printStackTrace();
            }
        });
        serializeObject(changeCurrencies, PATH);

    }



}

