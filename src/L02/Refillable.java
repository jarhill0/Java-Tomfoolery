package L02;

public class Refillable {
    private int quantity;

    public Refillable() {
        quantity = 10;
    }

    public Refillable(int amount) {
        quantity = amount;
    }

    public void useUp(int amount) {
        quantity -= amount;
    }

    public void addTo(int amount) {
        quantity += amount;
    }

    public void doubleCandyAmount() {
        quantity *= 2;
    }

    public int getQuantity() {
        return quantity;
    }
}
