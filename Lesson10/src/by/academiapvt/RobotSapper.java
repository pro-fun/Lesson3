package by.academiapvt;

public class RobotSapper implements Robot, RobotEngineer{
    private String model;
    private int powerUsing;
    private String powerUnitModel;
    private String manufacturerCountry;
    private String partForDemining;
    private String material;
    private boolean ifItSwitchedOn;

    public RobotSapper(){} ;

    public RobotSapper(String model, int powerUsing, String powerUnitModel, String manufacturerCountry, String partForDemining, String material, boolean ifItSwitchedOn) {
        this.model = model;
        this.powerUsing = powerUsing;
        this.powerUnitModel = powerUnitModel;
        this.manufacturerCountry = manufacturerCountry;
        this.partForDemining = partForDemining;
        this.material = material;
        this.ifItSwitchedOn = ifItSwitchedOn;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerUsing() {
        return powerUsing;
    }

    public void setPowerUsing(int powerUsing) {
        this.powerUsing = powerUsing;
    }

    public String getPowerUnitModel() {
        return powerUnitModel;
    }

    public void setPowerUnitModel(String powerUnitModel) {
        this.powerUnitModel = powerUnitModel;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public String getPartForDemining() {
        return partForDemining;
    }

    public void setPartForDemining(String partForDemining) {
        this.partForDemining = partForDemining;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isIfItSwitchedOn() {
        return ifItSwitchedOn;
    }

    public void setIfItSwitchedOn(boolean ifItSwitchedOn) {
        this.ifItSwitchedOn = ifItSwitchedOn;
    }

    @Override
    public String toString() {
        return "RobotSapper{" +
                "model='" + model + '\'' +
                ", powerUsing=" + powerUsing +
                ", powerUnitModel='" + powerUnitModel + '\'' +
                ", manufacturerCountry='" + manufacturerCountry + '\'' +
                ", partForDemining='" + partForDemining + '\'' +
                ", material='" + material + '\'' +
                ", ifItSwitchedOn=" + ifItSwitchedOn +
                '}';
    }

    @Override
    public void toMakeARobot() {
        model = "SuperDeminer";
        powerUsing = 22000;
        powerUnitModel = "литиевые аккумуляторы";
        manufacturerCountry = "Корея";
        partForDemining = "траки";
        material = "кевлар";
        ifItSwitchedOn = true;
    }

    @Override
    public void toRepairRobot() {

    }

    @Override
    public void toChangeMainPart(String newPart) {
        if (ifItSwitchedOn = true) {
            setPartForDemining(newPart);
        } else {
            System.out.println("Необходимо выключить робота");
        }
    }
    @Override
    public void toTurnOnRobot() {
        setIfItSwitchedOn(true);
    }

    @Override
    public void toSwitchOffRobot() {
        setIfItSwitchedOn(false);
    }

    @Override
    public void toShowAbilities() {
        System.out.println("Робот " + model + " разминирует");
    }

    @Override
    public void toCheckNewWorkingDocumentation() {
        System.out.println("Робот " + model + " загружает схему продвижения для разминирования");
    }
}
