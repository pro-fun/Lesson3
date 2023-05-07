package by.academiapvt;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        List<BusStop> listOfBusStops = createBusStops(4,2);
        Bus bus1 = new Bus("1", listOfBusStops);
        Bus bus2 = new Bus("2", listOfBusStops);
        Bus bus3 = new Bus("3", listOfBusStops);
        Bus bus4 = new Bus("4", listOfBusStops);

        Thread thread1 = new Thread(bus1);
        Thread thread2 = new Thread(bus2);
        Thread thread3 = new Thread(bus3);
        Thread thread4 = new Thread(bus4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();




    }
    static List<BusStop> createBusStops (int numberOfStops, int numberOfBusesForStop){
        List<BusStop> newlist = new ArrayList<>();
        for (int i = 0;i<numberOfStops;i++){
            BusStop busStop = new BusStop(i,new Semaphore(numberOfBusesForStop));
            newlist.add(busStop);
        }
        return newlist;
    }
}
