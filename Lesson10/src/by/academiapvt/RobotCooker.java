package by.academiapvt;

public class RobotCooker implements Robot{
    private String model;
    private int powerUsing;
    private String powerUnitModel;
    private String manufacturerCountry;
    private String creatingPart;
    private String material;
    private boolean ifItSwitchedOn;

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

    public String getCreatingPart() {
        return creatingPart;
    }

    public void setCreatingPart(String creatingPart) {
        this.creatingPart = creatingPart;
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

    public RobotCooker(String model, int powerUsing, String powerUnitModel, String manufacturerCountry, String creatingPart, String material, boolean ifItSwitchedOn) {
        this.model = model;
        this.powerUsing = powerUsing;
        this.powerUnitModel = powerUnitModel;
        this.manufacturerCountry = manufacturerCountry;
        this.creatingPart = creatingPart;
        this.material = material;
        this.ifItSwitchedOn = ifItSwitchedOn;
    }

    public RobotCooker() {
    }

    @Override
    public String toString() {
        return "RobotCooker{" +
                "model='" + model + '\'' +
                ", powerUsing=" + powerUsing +
                ", powerUnitModel='" + powerUnitModel + '\'' +
                ", manufacturerCountry='" + manufacturerCountry + '\'' +
                ", creatingPart='" + creatingPart + '\'' +
                ", material='" + material + '\'' +
                ", ifItSwitchedOn=" + ifItSwitchedOn +
                '}';
    }

    @Override
    public void toMakeARobot() {
        model = "T1000";
        powerUsing = 200;
        powerUnitModel = "Бесперебойник";
        manufacturerCountry = "Япония";
        creatingPart = "овощерезка";
        material = "пластик";
        ifItSwitchedOn = true;
    }

    @Override
    public void toRepairRobot() {

    }

    @Override
    public void toChangeMainPart(String newPart) {
        if (ifItSwitchedOn = true) {
            setCreatingPart(newPart);
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
        System.out.println("Робот " + model + " готовит");
    }


}
