package L05;

import util.BasicTester;

public class StudentTester extends BasicTester {
    public StudentTester() {
        Student joe = new Student("Joe", "Math Club");
        Student vyto = new Student("Vytautas", "Math Club");
        Student jared = new Student("Jared", "Bio Club");

        runTest("Joe", joe.getMyName(), "get name");
        runTest("Math Club", joe.getMyClub(), "get club");
        runTest(true, joe.isSameClub(joe), "same club as self");
        runTest(true, joe.isSameClub(vyto), "same club as friend");
        runTest(false, joe.isSameClub(jared), "different club from friend");

        finishTesting();
    }

    public static void main(String[] args) {
        new StudentTester();
    }
}
