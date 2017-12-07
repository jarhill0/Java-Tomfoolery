package L11;

import java.util.*;

public class Contestant {

    private int myInitialGuess;
    private boolean stay;
    private Random myRandoms;

    public Contestant(Random randoms, boolean stay) {
        myRandoms = randoms;
        this.stay = stay;
    }

    // The contestant makes his/her first guess.
    public int guess1() {
        myInitialGuess = myRandoms.nextInt(3) + 1;
        return myInitialGuess;
    }

    public int guess2(int openedDoor) {
        if (stay) {
            return myInitialGuess;
        } else {
            return 6 - (myInitialGuess + openedDoor); // "magical" formula to switch
        }
    }
}
