package misc.Yahtzee;

public enum Die {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);

    public final int value;

    Die(int number) {
        this.value = number;
    }
}
