package by.academiapvt;

public class Train implements AbstractTrain {
    private int trainNumber;
    private String route;
    private double distance;
    private State state;
    private double gasoline;
    private double consumption;
    private Fillness fillness;

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getGasoline() {
        return gasoline;
    }

    public void setGasoline(double gasoline) {
        this.gasoline = gasoline;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public Fillness getFillness() {
        return fillness;
    }

    public void setFillness(Fillness fillness) {
        this.fillness = fillness;
    }

    public Train(int trainNumber, String route, double distance, State state, double gasoline, double consumption, Fillness fillness) {
        this.trainNumber = trainNumber;
        this.route = route;
        this.distance = distance;
        this.state = state;
        this.gasoline = gasoline;
        this.consumption = consumption;
        this.fillness = fillness;
    }

    @Override
    public void toRefuel(double i) {
        this.gasoline = i + this.gasoline;
    }

    @Override
    public void toDepart() {
        double possibleDistance = gasoline / consumption * 100;
        if (possibleDistance < distance) {
            throw new MyException("Недостаточно топлива");
        }
        state = State.ONTHEROUTE;
        System.out.println("Поезд отбыл");

    }

    @Override
    public void toChangeState() {
    }

    @Override
    public void toDownload() {
        if (this.state == State.ONTHEROUTE) {
            throw new MyException("Поезд в пути");
        }
        if (this.fillness == Fillness.ISFILLED) {
            throw new MyException("Поезд загружен, нет места");
        }
        state = State.DOWNLOADING;
        System.out.println("Загружаем поезд");
    }

    @Override
    public void toUnload() {
        if (this.state == State.ONTHEROUTE) {
            throw new MyException("Поезд в пути");
        }
        if (this.fillness == Fillness.ISEMPTY) {
            throw new MyException("Поезд пуст, разгрузка невозможна");
        }
        state = State.UNLOADING;
        System.out.println("Загружаем поезд");
    }


}
