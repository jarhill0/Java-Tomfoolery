package L16;

public abstract class Player {
    private int myScore;

    public void increaseScore(int amount) {
        myScore += amount;
    }

    public int getScore() {
        return myScore;
    }

    public abstract boolean cooperates();


}
