package misc.Yahtzee;

import java.util.Random;

public class DieRoller {
    public static Die rollDie() {
        int val = new Random().nextInt(6) + 1;
        switch (val) {
            case 1:
                return Die.ONE;
            case 2:
                return Die.TWO;
            case 3:
                return Die.THREE;
            case 4:
                return Die.FOUR;
            case 5:
                return Die.FIVE;
            case 6:
                return Die.SIX;
        }
        return null;
    }
}
