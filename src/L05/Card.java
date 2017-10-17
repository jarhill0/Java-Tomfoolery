package L05;

public class Card {
    public Suit suit;
    public Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public boolean outranks(Card c) {
        if (rank.equals(c.rank)) {
            return suit.ordinal() > c.suit.ordinal();
        }
        return rank.ordinal() > c.rank.ordinal();
    }


}

enum Suit {SPADES, HEARTS, DIAMONDS, CLUBS}

enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}