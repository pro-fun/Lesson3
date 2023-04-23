package by.academiapvt;

public class Main {
    public static void main(String[] args) {
//        Task 1.3
        Train train = new Train(1,"Гомель-Минск", 320, State.ONTHEROUTE, 600, 250,Fillness.ISEMPTY);
        train.toRefuel(100);
        System.out.println(train.getGasoline());
//        Task 1.4
        train.toDepart();
//        Task 1.5, 1.6, 1.7
        train.toDownload();
        train.toUnload();
    }
}
