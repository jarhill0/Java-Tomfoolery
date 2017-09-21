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
                "\", should be: \"Homiy\"");
    }

    public static void main(String[] args) {
        new NameTester();
    }

}
