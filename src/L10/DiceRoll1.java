/**
 * this should be a BLUEJ EXERCISE
 * For random_6.html
 *
 *Complete the DieRollGenerator class given below. The nextRoll method should return a randomly chosen value between 1 and 6, inclusive.
 *
 */

import java.util.Random;

public class DiceRoll1 {

    private Random randGen;

    public DieRollGenerator ( ) {
        randGen = new Random ( );
    }

    public int nextRoll( ) {
        // You supply this code.

    }

    public void tester (int howMany) {
        int k;
        k = 0;
        while (k < howMany) {
            System.out.println (nextRoll ( ));
            k = k + 1;
        }
    }


}