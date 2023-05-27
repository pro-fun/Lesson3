package CurrencyChanger.domain;

import CurrencyChanger.constants.Currencies;

import java.io.Serializable;

public class ChangeCurrency implements Serializable {
    private Currencies currencyToChange;
    private Currencies currencyToReceive;
    private Double value;
    private static final long serialVersionUID = -7994607932307928487L;

    public ChangeCurrency(Currencies currencyToChange, Currencies currencyToReceive, Double value) {
        this.currencyToChange = currencyToChange;
        this.currencyToReceive = currencyToReceive;
        this.value = value;
    }

    public Currencies getCurrencyToChange() {
        return currencyToChange;
    }

    public void setCurrencyToChange(Currencies currencyToChange) {
        this.currencyToChange = currencyToChange;
    }

    public Currencies getCurrencyToReceive() {
        return currencyToReceive;
    }

    public void setCurrencyToReceive(Currencies currencyToReceive) {
        this.currencyToReceive = currencyToReceive;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Курс конвертации " + currencyToChange +
                " в " + currencyToReceive +
                " равен " + value +
                '}' + '\n';
    }
}
