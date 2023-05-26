package by.academiapvt;

public interface WarningObserver {
    void addAlarmStation(AlarmStation alarmStation);
    void sendAlarm(String alarm);
    void toSendPhoneNumbers();
}
