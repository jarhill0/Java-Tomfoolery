package misc.Yahtzee;

public class Checker {
    Die[] dice = new Die[5];

    public Checker(Die[] dice) {
        this.dice = dice;
    }

    private int numCounterHelper(int num) {
        int total = 0;
        for (Die d : dice) {
            if (d.value == num)
                total++;
        }
        return total;
    }

    private int sumDiceValues() {
        int total = 0;
        for (Die d : dice)
            total += d.value;
        return total;
    }

    int ones() {
        return numCounterHelper(1);
    }

    int twos() {
        return 2 * numCounterHelper(2);
    }

    int threes() {
        return 3 * numCounterHelper(3);
    }

    int fours() {
        return 4 * numCounterHelper(4);
    }

    int fives() {
        return 5 * numCounterHelper(5);
    }

    int sixes() {
        return 6 * numCounterHelper(6);
    }

    int threeOfAKind() {
        for (int i = 1; i <= 6; i++) {
            if (numCounterHelper(i) >= 3)
                return sumDiceValues();
        }
        return 0;
    }

    int fourOfAKind() {
        for (int i = 1; i <= 6; i++) {
            if (numCounterHelper(i) >= 4)
                return sumDiceValues();
        }
        return 0;
    }

    int fullHouse() {
        boolean gotThree = false;
        boolean gotTwo = false;
        for (int i = 1; i <= 6; i++) {
            if (numCounterHelper(i) == 3)
                gotThree = true;
            else if (numCounterHelper(i) == 2)
                gotTwo = true;
        }
        return (gotThree && gotTwo) ? 25 : 0;
    }

    int smallStraight() {
        for (int i = 1; i <= 3; i++) {
            boolean fourInARow = true;
            for (int j = i; j < i + 4; j++) {
                fourInARow = fourInARow && (numCounterHelper(j) >= 1);
            }
            if (fourInARow)
                return 30;
        }
        return 0;
    }

    int largeStraight() {
        for (int i = 1; i <= 2; i++) {
            boolean fiveInARow = true;
            for (int j = i; j < i + 5; j++) {
                fiveInARow = fiveInARow && (numCounterHelper(j) >= 1);
            }
            if (fiveInARow)
                return 40;
        }
        return 0;
    }

    int yahtzee() {
        for (int i = 1; i <= 6; i++) {
            if (numCounterHelper(i) == 5)
                return 50;
        }
        return 0;
    }

    int chance() {
        return sumDiceValues();
    }

    void printScores() {
        String out = "==Numbers===";
        out += "\nOnes: " + ones();
        out += "\nTwos: " + twos();
        out += "\nThrees: " + threes();
        out += "\nFours " + fours();
        out += "\nFives: " + fives();
        out += "\nSixes: " + sixes();

        out += "\n\n==Specials==";
        out += "\nThree of a kind: " + threeOfAKind();
        out += "\nFour of a kind: " + fourOfAKind();
        out += "\nFull House: " + fullHouse();
        out += "\nSmall Straight: " + smallStraight();
        out += "\nLarge Straight: " + largeStraight();
        out += "\nYAHTZEE: " + yahtzee();
        out += "\nChance: " + chance();

        System.out.println(out);
    }
}
