package L01;

public class CellPhone {
    boolean isCharging;
    double batteryLevel;
    String brandName;
    int version;

    // Default constructor
    public CellPhone() {
        this.isCharging = false;
        this.batteryLevel = 0.8;
        this.brandName = "JavaPhone";
        this.version = 18;
    }

    // Custom constructor
    public CellPhone(boolean isCharging, double batteryLevel, String brandName, int version) {
        this.isCharging = isCharging;
        this.batteryLevel = batteryLevel;
        this.brandName = brandName;
        this.version = version;
    }
}
