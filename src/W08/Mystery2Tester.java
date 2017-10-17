package W08;

import util.BasicTester;

public class Mystery2Tester extends BasicTester {
    public Mystery2Tester() {
        ClassWork myst = new ClassWork();

        runTest(false, myst.mystery2(0, 0, 0), "000");
        runTest(true, myst.mystery2(0, 0, 1), "001");
        runTest(true, myst.mystery2(0, 1, 0), "010");
        runTest(false, myst.mystery2(0, 1,  1), "011");
        runTest(true, myst.mystery2(1, 0, 0), "100");
        runTest(false, myst.mystery2(1, 0, 1), "101");
        runTest(false, myst.mystery2(1, 1, 0), "110");
        runTest(false, myst.mystery2(1, 1, 1), "111");

        finishTesting();

    }

    public static void main(String[] args) {
        new Mystery2Tester();
    }
}
