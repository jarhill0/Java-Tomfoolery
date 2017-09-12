package L02;

public class CandyJar {
    private int quantity;

    public CandyJar() {
        quantity = 10;
    }

    public CandyJar(int amount) {
        quantity = amount;
    }

    public void eat(int amount) {
        quantity -= amount;
    }

    public void refill(int amount) {
        quantity += amount;
    }

    public void doubleCandyAmount() {
        quantity *= 2;
    }
}
