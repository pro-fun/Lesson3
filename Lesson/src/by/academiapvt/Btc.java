package by.academiapvt;

public class Btc implements AlarmStation {
    private final static String name = "Белтелеком";
    @Override
    public void toSendMessage(String alarm) {
        System.out.println("Всем абонентам" + name + " следует обратить внимание на следующую опасность: " + alarm);
    }

    @Override
    public void toSendHelpNumber() {
        System.out.println("Телефон помощи " + name + " 0110");
    }
}
