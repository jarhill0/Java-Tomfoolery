package W11;

public class DigitSum {
    private int originalNumber;
    private int sum = 0;

    public DigitSum(int number) {
        originalNumber = number;
        number = number > 0 ? number : -number;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
    }

    public int getOriginalNumber() {
        return originalNumber;
    }

    public int getSum() {
        return sum;
    }
}
