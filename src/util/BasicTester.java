package util;

public class BasicTester {
    private int totalNumTests;
    private int testsPassed = 0;

    public void runTest(int expected, int actual, String testName) {
        totalNumTests++;
        if (expected != actual) {
            printFailMessage(String.valueOf(expected), String.valueOf(actual), testName);
        } else {
            testsPassed++;
        }
    }

    public void runTest(String expected, String actual, String testName) {
        totalNumTests++;
        if (!expected.equals(actual)) {
            printFailMessage(expected, actual, testName);
        } else {
            testsPassed++;
        }
    }

    public void runTest(boolean expected, boolean actual, String testName) {
        totalNumTests++;
        if (expected != actual) {
            printFailMessage(String.valueOf(expected), String.valueOf(actual), testName);
        } else {
            testsPassed++;
        }
    }

    public void runTest(double expected, double actual, String testName) {
        totalNumTests++;
        if (expected != actual) {
            printFailMessage(String.valueOf(expected), String.valueOf(actual), testName);
        } else {
            testsPassed++;
        }
    }

    public void manualPassedTest() {
        totalNumTests++;
        testsPassed++;
    }

    public void manualFailedTest() {
        totalNumTests++;
    }

    public void finishTesting() {
        System.out.println(String.format("Done testing. Passed %d/%d.", testsPassed, totalNumTests));
    }

    private void printFailMessage(String expected, String actual, String testName) {
        System.out.println(String.format("Test '%s' failed. Expected '%s' but got '%s'.", testName, expected, actual));
    }
}
