package W09;

import util.BasicTester;

public class StupidStringFunctionsTester extends BasicTester {

    public StupidStringFunctionsTester() {
        runTest(5, StupidStringFunctions.length("hello"), "nonzero length");
        runTest(0, StupidStringFunctions.length(""), "zero length");
        runTest(11, StupidStringFunctions.length("hello world"), "nonzero length with spaces");

        runTest(0, StupidStringFunctions.lengthNonBlank(""), "zero nonblank length");
        runTest(5, StupidStringFunctions.lengthNonBlank("hello"), "nonzero no spaces nonblank length");
        runTest(10, StupidStringFunctions.lengthNonBlank("hello world"), "nonzero spaces nonblank length");
        runTest(0, StupidStringFunctions.lengthNonBlank("   \n"), "blank only nonblank length");

        runTest("", StupidStringFunctions.copyString("hi", 0), "copy nonempty string zero times");
        runTest("hi", StupidStringFunctions.copyString("hi", 1), "copy nonempty string twice");
        runTest("hihihihihihihi", StupidStringFunctions.copyString("hi", 7), "copy nonempty string 7x");
        runTest("", StupidStringFunctions.copyString("", 4), "copy empty string multiple times");

        try {
            StupidStringFunctions.copyString("", -1);
            manualFailedTest();
        } catch (IllegalArgumentException e) {
            manualPassedTest();
        }

        runTest("", StupidStringFunctions.mergeStrings("", ""), "merge two empty strings");
        runTest("hello", StupidStringFunctions.mergeStrings("hello", ""), "merge nonempty string with empty string 1");
        runTest("hello", StupidStringFunctions.mergeStrings("", "hello"), "merge nonempty string with empty string 2");
        runTest("htehlelroe", StupidStringFunctions.mergeStrings("hello", "there"), "merge 2 nonempty strings with equal length");
        runTest("htehlelroe123", StupidStringFunctions.mergeStrings("hello", "there123"), "merge 2 nonempty strings with unequal length 1");
        runTest("htehlelroe123", StupidStringFunctions.mergeStrings("hello123", "there"), "merge 2 nonempty strings with unequal length 2");


        finishTesting();
    }

    public static void main(String[] args) {
        new StupidStringFunctionsTester();
    }
}
