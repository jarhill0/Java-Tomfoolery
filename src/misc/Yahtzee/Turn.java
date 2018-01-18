package misc.Yahtzee;

public class Turn {
    private int playerNum;
    private int rerollsLeft = 2;
    private Die[] dice = new Die[5];

    public Turn(int playerNum) {
        this.playerNum = playerNum;
    }

    public void takeTurn() {
        for (int i = 0; i < 5; i++) {
            dice[i] = DieRoller.rollDie();
        }

        for (Die d : dice) {
            System.out.print(d.value + " ");
        }

        System.out.println();

        Checker checker = new Checker(dice);
        checker.printScores();
    }

    public static void main(String[] args) {
        new Turn(0).takeTurn();
    }
}
