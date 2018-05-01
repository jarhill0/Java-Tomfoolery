package misc;

import java.util.Random;

public class RecursiveStrFinder {
    public static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final Random r = new Random();

    public static boolean checkString2(String str, String findThis) {
        if (str.length() < 1)
            return false;
        if (str.substring(0, 1).equals(findThis) || str.substring(str.length() - 1).equals(findThis))
            return true;
        else
            return checkString2(str.substring(1), findThis) && checkString2(str.substring(0, str.length() - 1), findThis);
    }

    public static String genString(int len) {
        String s = "";
        for (int i = 0; i < len; i++) {
            int c = r.nextInt(26);
            s += letters.substring(c, c + 1);
        }
        return s;
    }

    public static void test(int times) {
        for (int t = 0; t < times; t++) {
            String findThis = genString(1);
            String search = genString(13);
            boolean trueResult = search.contains(findThis);
            boolean gottenResult = checkString2(search, findThis);

            if (trueResult != gottenResult) {
                System.out.printf("Got %b and expected %b\n", gottenResult, trueResult);
                System.out.printf("str=%s, findThis=%s\n", search, findThis);
            }
        }
    }

    public static void main(String[] args) {
        test(10000);
    }
}


//BASE CASE:
//if str is an empty string, return false.
//if str either ends or starts with the single character findThis, return True
//
//RECURSIVE CASE:
//check that the following are both true:
// - checkString2 of the string with the last letter stripped off
// - checkString2 of the string with the first letter stripped off.
//I assert that both of these will eventually be true.