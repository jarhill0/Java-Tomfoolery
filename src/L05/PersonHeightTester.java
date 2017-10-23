package L05;

import util.BasicTester;

public class PersonHeightTester extends BasicTester {
    public PersonHeightTester() {
        Person shorty = new Person(2);
        Person tall = new Person(25);
        Person tall2 = new Person(25);

        runTest(false, shorty.equals(tall), "short equals tall?");
        runTest(false, tall.equals(shorty), "tall equals short?");
        runTest(true, shorty.equals(shorty), "short equals itself?");
        runTest(true, tall.equals(tall2), "tall equals other tall?");

        finishTesting();
    }

    public static void main(String[] args) {
        new PersonHeightTester();
    }
}
