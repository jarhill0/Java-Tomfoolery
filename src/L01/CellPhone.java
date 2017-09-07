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

    // Custom contructor: 2 parameters
    public CellPhone(int numCalls, double batteryLife) {
        this.numCalls = numCalls;
        this.batteryLife = batteryLife;
        model = "JavaPhone";
        isOn = true;
    }

    // Custom constructor
    public CellPhone(boolean isOn, double batteryLife, String model, int numCalls) {
        this.isOn = isOn;
        this.batteryLife = batteryLife;
        this.model = model;
        this.numCalls = numCalls;
    }
}
