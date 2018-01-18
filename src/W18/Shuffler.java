package W18;

import java.util.ArrayList;

public class Shuffler {
    private ArrayList<Integer> cards;

    public Shuffler() {
        cards = new ArrayList<Integer>(52);
        for (int i = 0; i < 52; i++) {
            cards.add(i);
        }
    }

    void perfectShuffle() {
        ArrayList<Integer> newCards = new ArrayList<Integer>(52);
        for (int i = 0; i < 52 / 2; i++) {
            newCards.add(cards.get(i));
            newCards.add(cards.get(i + 26));
        }
        cards = newCards;
    }

    boolean isOrdered() {
        for (int i = 0; i < 52; i++) {
            if (cards.get(i) != i) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Shuffler s = new Shuffler();
        int c = 0;
        do {
            s.perfectShuffle();
            c++;
        } while (!s.isOrdered());

        System.out.println(c);
    }
}
