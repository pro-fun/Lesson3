package by.academiapvt;

public class RobotBuilder implements Robot, RobotEngineer {
    private String model;
    private int powerUsing;
    private String powerUnitModel;
    private String manufacturerCountry;
    private String partForBuilding;
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

    public String getPartForBuilding() {
        return partForBuilding;
    }

    public void setPartForBuilding(String partForBuilding) {
        this.partForBuilding = partForBuilding;
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
        return "RobotBuilder{" +
                "model='" + model + '\'' +
                ", powerUsing=" + powerUsing +
                ", powerUnitModel='" + powerUnitModel + '\'' +
                ", manufacturerCountry='" + manufacturerCountry + '\'' +
                ", partForBuilding='" + partForBuilding + '\'' +
                ", material='" + material + '\'' +
                ", ifItSwitchedOn=" + ifItSwitchedOn +
                '}';
    }

    @Override
    public void toMakeARobot() {
        model = "Station DS1000";
        powerUsing = 15000;
        powerUnitModel = "ДВС";
        manufacturerCountry = "Германия";
        partForBuilding = "бетононасос";
        material = "металл";
        ifItSwitchedOn = true;

    }

    @Override
    public void toRepairRobot() {

    }

    @Override
    public void toChangeMainPart(String newPart) {
        if (ifItSwitchedOn = true) {
            setPartForBuilding(newPart);
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
        System.out.println("Робот " + model + " строит");
    }

    @Override
    public void toCheckNewWorkingDocumentation() {
        {
            System.out.println("Робот " + model + " загружает чертежи для ремонта");
        }
    }
}
