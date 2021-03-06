package W08;

import java.util.Arrays;
import java.util.Collections;


public class ClassWork {
    public boolean areIncreasing(int a, int b, int c) {
        return (c >= b && b >= a);
    }

    public boolean haveSameSign(int a, int b) {
        return ((a >= 0 && b >= 0) || (a < 0 && b < 0));
    }

    public boolean haveSameSign2(int a, int b) {
        return (a * b > 0);
    }

    public boolean mystery(int a, int b, int c) {
        return (((a == 0 && b == 0) || (a == 0 && c == 0) || (b == 0 && c == 0)) && !(a == b && b == c));
    }

    public boolean mystery2(int a, int b, int c) {
        return Collections.frequency(Arrays.asList(new Integer[]{a, b, c}), 0) == 2;
    }

    public boolean mystery3(int a, int b, int c) {
        return a == 0 ? b == 0 ^ c == 0 : b == 0 && c == 0;
    }

}

