package L10;

import java.util.Random;

public class DiceRoll1 {

    private Random randGen;

    public DiceRoll1() {
        randGen = new Random();
    }

    public int nextRoll() {
        return randGen.nextInt(6) + 1;
    }

    public void tester(int howMany) {
        int k;
        k = 0;
        while (k < howMany) {
            System.out.println(nextRoll());
            k = k + 1;
        }
    }

    public static void main(String[] args) {
        new DiceRoll1().tester(20);
    }

}