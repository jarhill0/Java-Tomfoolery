package L04;

import util.BasicTester;

public class Refillable2Tester2 extends BasicTester {
    public Refillable2Tester2() {
        super();
        Refillable2 r = new Refillable2(-10);
        runTest(0, r.currentAmount(), "Initialization");
        r.refill(-3);
        runTest(3, r.currentAmount(), "Refill negative");
        r.refill(2);
        runTest(5, r.currentAmount(), "Refill positive");
        r.refill(10);
        try {
            r.useUp(-5);
        } catch (UsingTooMuchException e) {
        }
        runTest(10, r.currentAmount(), "Use up negative");
        try {
            r.useUp(4);
        } catch (UsingTooMuchException e) {
        }
        runTest(6, r.currentAmount(), "Use up positive");
        try {
            r.useUp(7);
            manualFailedTest();
        } catch (UsingTooMuchException e) {
            manualPassedTest();
        }
        finishTesting();
    }

    public static void main(String[] args) {
        new Refillable2Tester2();
    }
}
