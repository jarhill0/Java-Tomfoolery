package L02;

public class Refillable {
    private int quantity;
    private int uses = 0;
    private int totalUsed = 0;

    public Refillable() {
        quantity = 10;
    }

    public Refillable(int amount) {
        quantity = amount;
    }

    public void useUp(int amount) {
        quantity -= amount;
        totalUsed += amount;
        uses++;
    }

    public void addTo(int amount) {
        quantity += amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public double averageUse() {
        return (double) totalUsed / (double) uses;
    }
}
