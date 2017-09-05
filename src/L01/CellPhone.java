package L01;

public class CellPhone {
    boolean isCharging;
    double batteryLevel;
    String brandName;
    int version;

    public CellPhone(boolean isCharging, double batteryLevel, String brandName, int version) {
        this.isCharging = isCharging;
        this.batteryLevel = batteryLevel;
        this.brandName = brandName;
        this.version = version;
    }
}
