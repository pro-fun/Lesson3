package by.academiapvt;

import java.util.ArrayList;
import java.util.List;

public class Police implements WarningObserver{
    private List<AlarmStation> alarmStations;
    private static Police police;

    private Police() {
    }

    public static Police getInstance() {
        if (police == null) {
            police = new Police();
        }
        return police;
    }

    public void addAlarmStation(AlarmStation alarmStation) {
        if (alarmStations == null) {
            alarmStations = new ArrayList<>();
        }
        alarmStations.add(alarmStation);
    }

    @Override
    public void sendAlarm(String alarm) {
        alarmStations.forEach(alarmStation1 -> alarmStation1.toSendMessage(alarm));
    }

    @Override
    public void toSendPhoneNumbers() {
        alarmStations.forEach(AlarmStation::toSendHelpNumber);
    }
}
