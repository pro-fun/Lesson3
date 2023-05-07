package by.academiapvt;

import java.util.List;


public class Bus implements Runnable {

    private String numberOfMarschroute;

    private List<BusStop> numberOfBusStops;



    public Bus() {

    }


    public Bus(String numberOfMarschroute, List<BusStop> numberOfBusStops) {
        this.numberOfMarschroute = numberOfMarschroute;
        this.numberOfBusStops = numberOfBusStops;
    }

    @Override
    public void run() {
        System.out.println("Автобус номер " + numberOfMarschroute + " отбывает по маршруту");
        for (BusStop busStop: numberOfBusStops) {
            Thread thisBusStop = new Thread(busStop);
            thisBusStop.setName(numberOfMarschroute);
            thisBusStop.start();
        }

    }
}