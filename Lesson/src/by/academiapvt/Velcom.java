package by.academiapvt;

public class Velcom implements AlarmStation {
    private static final String name = "Velcom";
    @Override
    public void toSendMessage(String alarm) {
        System.out.println("Просим Всех абонентов " + name + " принять меры предосторожности в связи со следующей опасностью: " + alarm);
    }
    public void toSendHelpNumber() {
        System.out.println("Телефон помощи " + name + " 0220");
    }
}
