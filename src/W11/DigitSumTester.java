package W11;

import util.BasicTester;

public class DigitSumTester extends BasicTester {
    public DigitSumTester() {
        DigitSum d = new DigitSum(123);
        runTest(123, d.getOriginalNumber(), "retrieve original number");
        runTest(6, d.getSum(), "retrieve sum");
        DigitSum e = new DigitSum(321);
        runTest(e.getSum(), d.getSum(), "two numbers sum to the same thing 1");
        DigitSum f = new DigitSum(6);
        runTest(f.getSum(), d.getSum(), "two numbers sum to the same thing 2");
        DigitSum g = new DigitSum(-6);
        runTest(6, g.getSum(), "negative numbers have digit sums");

        finishTesting();
    }

    public static void main(String[] args) {
        new DigitSumTester();
    }
}
