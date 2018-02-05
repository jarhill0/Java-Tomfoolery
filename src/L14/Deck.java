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
        myCards = new ArrayList<Card>(52);
        for (int s = 0; s < 4; s++) {
            for (int r = 0; r < 13; r++)
                myCards.add(new Card(r, s));
        }
    }

    public void perfectShuffle() {
        ArrayList<Card> newCards = new ArrayList<Card>(52);
        for (int i = 0; i < 52 / 2; i++) {
            newCards.add(myCards.get(i));
            newCards.add(myCards.get(i + 26));
        }
        myCards = newCards;
    }

    public void exchangeShuffle() {
        for (int _ = 0; _ < 10000; _++) {
            int aIndex = randGen.nextInt(52);
            int bIndex = randGen.nextInt(52);
            Card a = myCards.get(aIndex);
            Card b = myCards.get(bIndex);
            myCards.set(aIndex, b);
            myCards.set(bIndex, a);
        }
    }

    public void selectionShuffle() {
        ArrayList<Card> newCards = new ArrayList<Card>(52);
        for (int _ = 0; _ < 52; _++) {
            int i = randGen.nextInt(myCards.size());
            Card c = myCards.remove(i);
            newCards.add(c);
        }
        myCards = newCards;
    }

    public void selectionSort() {
        ArrayList<Card> newCards = new ArrayList<Card>(52);
        //todo
        myCards = newCards;
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
