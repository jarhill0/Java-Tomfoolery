package WTG;

public class C4 {
    public static int stupidAddition() {
        int num = 3;
        while (num <= 60)
            num += 5;
        return num;
    }

    public static int eCount(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == 'e')
                count++;
        }
        return count;
    }

    public static boolean isNumber(String x) {
        // fake method for code autocompletion
        return x.equals("7");
    }

    public static int numCounter(String x) {
        int numbers = 0;
        for (int i = 0; i < x.length(); i++) {
            if (isNumber(x.substring(i, i + 1)))
                numbers++;
        }
        return numbers;
    }

    public static int twoRunCounter(String x) {
        int counter = 0;
        int i = 1;
        char lastChar;
        char thisChar;
        while (i < x.length()) {
            thisChar = x.charAt(i);
            lastChar = x.charAt(i - 1);
            if (lastChar == thisChar) {
                counter++;

                //skip a character
                i++;
            }
            i++;
        }
        return counter;
    }


}