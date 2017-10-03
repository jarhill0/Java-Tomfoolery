package L04;

public class Refillable2Tester {

    public Refillable2Tester() {
        int totalTests = 6;
        int passedTests = 0;
        Refillable2 r = new Refillable2(-10);
        if (runTest(0, r.currentAmount(), "Initialization"))
            passedTests++;

        r.refill(-3);
        if (runTest(3, r.currentAmount(), "Refill negative"))
            passedTests++;

        r.refill(2);
        if (runTest(5, r.currentAmount(), "Refill positive"))
            passedTests++;

        r.refill(10);
        try {
            r.useUp(-5);
        } catch (UsingTooMuchException e) {
        }
        if (runTest(10, r.currentAmount(), "Use up negative"))
            passedTests++;

        try {
            r.useUp(4);
        } catch (UsingTooMuchException e) {
        }
        if (runTest(6, r.currentAmount(), "Use up positive"))
            passedTests++;

        try {
            r.useUp(7);
        } catch (UsingTooMuchException e) {
            passedTests++;
        }

        System.out.println(String.format("Done. Passed %d/%d.", passedTests, totalTests));

    }

    private static boolean runTest(int expected, int actual, String testName) {
        if (expected != actual) {
            System.out.println(testName + " failed. Expected \"" + expected + "\" but got \"" + actual + "\".");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new Refillable2Tester();
    }

}
