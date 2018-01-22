package L14;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

class Card {

    // This class represents a Card.
    // each card has a getSuit and a getRank.  The values for these int are specified in the
    //  toString method at the bottom of this class.
    private int mySuit, myRank;

    public Card(int r, int s) {
        mySuit = s;
        myRank = r;
    }

    public int getSuit() {
        return mySuit;
    }

    public int getRank() {
        return myRank;
    }

    public boolean outranks(Card other) {
        throw new NotImplementedException(); //todo
    }

    public String toString() {
        String rtn;
        switch (myRank) {
            case 0:
                rtn = "ace";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                rtn = "" + (myRank + 1);
                break;
            case 10:
                rtn = "jack";
                break;
            case 11:
                rtn = "queen";
                break;
            case 12:
                rtn = "king";
                break;
            default:
                throw new IllegalArgumentException(myRank + " is not a valid rank.");
        }
        rtn += " of ";
        switch (mySuit) {
            case 0:
                return rtn + "clubs";
            case 1:
                return rtn + "diamonds";
            case 2:
                return rtn + "hearts";
            case 3:
                return rtn + "spades";
            default:
                throw new IllegalArgumentException(mySuit + " is not a valid suit.");
        }
    }
}