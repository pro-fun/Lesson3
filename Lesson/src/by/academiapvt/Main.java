package by.academiapvt;

public class Main {
    public static void main(String[] args) {
        AlarmStation alarmStation1 = new Life();
        AlarmStation alarmStation2 = new Btc();
        AlarmStation alarmStation3 = new MTC();
        AlarmStation alarmStation4 = new Velcom();
        Police police = Police.getInstance();
        police.addAlarmStation(alarmStation1);
        police.addAlarmStation(alarmStation2);
        police.addAlarmStation(alarmStation3);
        police.addAlarmStation(alarmStation4);
        police.sendAlarm("На дорогах гололёд");
        police.toSendPhoneNumbers();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        police.sendAlarm("Штормовое предупреждение");
    }
}
