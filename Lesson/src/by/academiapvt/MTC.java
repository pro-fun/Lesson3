package by.academiapvt;

public class MTC implements AlarmStation {
    private final static String name = "MTC";
    @Override
    public void toSendMessage(String alarm) {
        System.out.println("Уважаемые абоненты " + name + ", объявляется о следующей опасности: " + alarm);
    }
    public void toSendHelpNumber() {
        System.out.println("Телефон помощи " + name + " 0440");
    }
}
