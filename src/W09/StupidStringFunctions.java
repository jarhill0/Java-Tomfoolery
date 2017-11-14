package W09;


public class StupidStringFunctions {
    public static int length(String str) {
        // "inspired by" https://redd.it/7cgvkf
        for (int i = 0; ; i++) {
            try {
                str.charAt(i);
            } catch (StringIndexOutOfBoundsException e) {
                return i;
            }
        }
    }

    public static int lengthNonBlank(String str) {
        String blankChars = "   \n";
        int count = 0;
        while (!str.equals("")) {
            if (!blankChars.contains(str.subSequence(0, 1))) {
                count++;
            }
            str = str.substring(1);
        }
        return count;
    }

    public static String copyString(String str, int copies) throws IllegalArgumentException {
        // janky and likely inefficient
        if (copies < 0) {
            throw new IllegalArgumentException("copies must be zero or a positive integer.");
        }
        String result = "";
        for (int i = 0; i < copies; i++) {
            result += str;
        }
        return result;
    }

    public static String mergeStrings(String str1, String str2) {
        char[] result = new char[2 * Math.min(str1.length(), str2.length())];
        int i = 0;
        while (!str1.equals("") && !str2.equals("")) {
            result[i] = str1.charAt(0);
            i++;
            str1 = str1.substring(1);

            result[i] = str2.charAt(0);
            i++;
            str2 = str2.substring(1);
        }
        // one (or both) of our strings is now empty, so add the remainder
        return new String(result) + str1 + str2;
    }

    public static void main(String[] args) {
        System.out.println(length("hello"));
        System.out.println(length("hello world"));
        System.out.println(length(""));
    }


}
