package L04;

public class Refillable2 {

    private int myAmount;
    private int myUseUpCallCount;
    private int myTotalUse;

    // Initialize a Refillable object having initialAmount units.
    public Refillable2(int initialAmount) {
        myAmount = (initialAmount >= 0) ? initialAmount : 0;
        myUseUpCallCount = 0;
        myTotalUse = 0;
    }

    // Use amount units.
    public void useUp(int amount) throws UsingTooMuchException {
        amount = (amount >= 0) ? amount : -1 * amount;
        if (amount > myAmount) {
            throw new UsingTooMuchException();
        }
        myAmount -= amount;
        myUseUpCallCount++;
        myTotalUse += amount;
    }

    // Add amount to the current amount.
    public void refill(int amount) {
        amount = (amount >= 0) ? amount : -1 * amount;
        myAmount += amount;
    }

    // Return the current amount.
    public int currentAmount() {
        return myAmount;
    }

    public int averageUse() {
        return myTotalUse / myUseUpCallCount;
    }
}


class UsingTooMuchException extends Exception {
}