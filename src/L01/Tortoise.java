package L01;

import java.util.Arrays;

public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) {
            return null;
        }
        double myv1 = v1 / 3600.0; // convert to feet per second
        double myv2 = v2 / 3600.0; // convert to feet per second
        int seconds = (int) (g *1.0 / (myv2 - myv1));
        int minutes = seconds / 60;
        seconds %= 60;
        int hours = minutes / 60;
        minutes %= 60;
        return new int[]{hours, minutes, seconds};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Tortoise.race(720, 850, 70)));
        System.out.println(Arrays.toString(Tortoise.race(80, 91, 37)));
        System.out.println(Arrays.toString(Tortoise.race(80, 100, 40)));
    }
}