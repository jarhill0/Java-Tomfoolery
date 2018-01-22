package L14;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Deck {

    // This class represents a deck of cards.

    private ArrayList<Card> myCards;
    private Random randGen = new Random();

    public Deck() {
        reset();
    }

    public void reset() {
        throw new NotImplementedException(); //todo
    }

    public void perfectShuffle() {
        throw new NotImplementedException(); //todo
    }

    public void exchangeShuffle() {
        throw new NotImplementedException(); //todo
    }

    public void selectionShuffle() {
        throw new NotImplementedException(); //todo
    }

    public void selectionSort() {
        throw new NotImplementedException(); //todo
    }

    public void insertionSort() {
        throw new NotImplementedException(); //todo
    }

    // Sort myCards using a comparison counting sort:
    //	element 0 is the one that isn't greater than any of the others;
    //	element 1 is the one that's greater than exactly one of the others;
    //	element 2 is the one that's greater than exactly two of the others;
    //		...
    public void countingSort() {
        ArrayList<Card> sorted = new ArrayList<Card>();
        for (int k = 0; k < myCards.size(); k++) {
            int numLessThan = 0;
            for (int j = 0; j < myCards.size(); j++) {
                if (myCards.get(k).outranks(myCards.get(j))) {
                    numLessThan++;
                }
            }
            sorted.set(numLessThan, myCards.get(k));
        }
        myCards = sorted;
    }

    public void print() {
        for (Card c : myCards) {
            System.out.println(c);
        }
    }
}
