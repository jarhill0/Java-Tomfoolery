package W08;

import util.BasicTester;

public class Mystery3Tester extends BasicTester {
    public Mystery3Tester() {
        ClassWork myst = new ClassWork();

        runTest(false, myst.mystery3(0, 0, 0), "000");
        runTest(true, myst.mystery3(0, 0, 1), "001");
        runTest(true, myst.mystery3(0, 1, 0), "010");
        runTest(false, myst.mystery3(0, 1, 1), "011");
        runTest(true, myst.mystery3(1, 0, 0), "100");
        runTest(false, myst.mystery3(1, 0, 1), "101");
        runTest(false, myst.mystery3(1, 1, 0), "110");
        runTest(false, myst.mystery3(1, 1, 1), "111");

        finishTesting();

    }

    public static void main(String[] args) {
        new Mystery3Tester();
    }
}
