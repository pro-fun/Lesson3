package CurrencyChanger.constants;

public enum Currencies {
    BYN("BYN"),
    USD("USD"),
    EUR("EUR"),
    RUB("RUB");
    private String name;

    Currencies(String name) {
        this.name = name;
    }
}
