package L03;

public class HangmanTester {
    public HangmanTester() {
        PartialHangman game = new PartialHangman("Elephant");
        PartialHangman shortWord = new PartialHangman("yo");
        int totalTests = 6;
        int passedTests = 0;
        if (runTest("_l______", game.update("l"), "Letter l")) {
            passedTests++;
        }
        if (runTest("el______", game.update("e"), "Letter e #1")) {
            passedTests++;
        }
        if (runTest("el__h___", game.update("h"), "Letter h")) {
            passedTests++;
        }
        if (runTest("ele_h___", game.update("e"), "Letter e #2")) {
            passedTests++;
        }
        if (runTest("_o", shortWord.update("o"), "Letter o")) {
            passedTests++;
        }
        if (runTest("yo", shortWord.update("y"), "Letter y")) {
            passedTests++;
        }

        System.out.println("Finished testing. Passed " + String.valueOf(passedTests) + "/" + String.valueOf(totalTests));

    }

    private static boolean runTest(String expected, String actual, String testName) {
        if (!expected.equals(actual)) {
            System.out.println(testName + " failed. Expected \"" + expected + "\" but got \"" + actual + "\".");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new HangmanTester();
    }
}
