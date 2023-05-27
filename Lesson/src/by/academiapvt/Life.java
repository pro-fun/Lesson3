package by.academiapvt;

public class Life implements AlarmStation {
    private final static String name = "Life";
    @Override
    public void toSendMessage(String alarm) {
        System.out.println("Друзья. Компания " + name + " предупреждает Вас о следующей опасности: " + alarm);
    }
    public void toSendHelpNumber() {
        System.out.println("Телефон помощи " + name + " 0330");
    }
}
