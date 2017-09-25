package L03;

public class NameTester {
    public NameTester() {
        Name testName = new Name(" Homie", "  killin  ", "IT       ");
        System.out.println("Last first: \"" +
                testName.lastFirst() +
                "\", should be: \"It, Homie Killin\"");

        System.out.println("Full name: \"" +
                testName.fullName() +
                "\", should be: \"Homie Killin It\"");

        System.out.println("Initials: \"" +
                testName.initials() +
                "\", should be: \"HKI\"");

        System.out.println("Nickname: \"" +
                testName.nickname() +
                "\", should be: \"HI\"");
    }

    public static void altTester() {
        Name testName = new Name(" Homie", "  killin  ", "IT       ");
        int totalTests = 4;
        int passedTests = 0;
        if (testName("Homie Killin It", testName.fullName(), "fullName()")) {
            passedTests++;
        }
        if (testName("It, Homie Killin", testName.lastFirst(), "lastFirst()")) {
            passedTests++;
        }
        if (testName("HKI", testName.initials(), "initials()")) {
            passedTests++;
        }
        if (testName("HI", testName.nickname(), "nickname()")) {
            passedTests++;
        }
        System.out.println("Testing completed. Passed " + String.valueOf(passedTests) + "/" + String.valueOf(totalTests));


    }

    private static boolean testName(String expected, String actual, String testName) {
        if (!expected.equals(actual)) {
            System.out.println("Test " + testName + " failed. (Expected \"" + expected + "\" but got \"" + actual + "\")");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //new NameTester();
        NameTester.altTester();
    }

}
