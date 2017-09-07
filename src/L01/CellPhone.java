package L01;

public class CellPhone {
    boolean isOn;
    double batteryLife;
    String model;
    int numCalls;

    // Default constructor
    public CellPhone() {
        this.isOn = true;
        this.batteryLife = 14.7;
        this.model = "JavaPhone";
        this.numCalls = 18;
    }

    // Custom constructor
    public CellPhone(boolean isOn, double batteryLife, String model, int numCalls) {
        this.isOn = isOn;
        this.batteryLife = batteryLife;
        this.model = model;
        this.numCalls = numCalls;
    }
}
