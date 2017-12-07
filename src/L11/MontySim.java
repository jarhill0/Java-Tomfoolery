package L11;

public class MontySim {


    public MontySim(int numGames) {
        System.out.println("Staying.");
        runSimulation(numGames, true);
        System.out.println("Switching.");
        runSimulation(numGames, false);
    }


    public void runSimulation(int numGames, boolean stay) {
        Monty m = new Monty(stay);
        int countRuns = 0;
        int myWinTotal = 0;
        while (countRuns < numGames) {
            if (m.playGame()) {
                myWinTotal++;
            }
            countRuns++;
        }

        System.out.println((myWinTotal * 100.0) / numGames + "% win rate.");
    }

    public static void main(String[] args) {
        new MontySim(10000);
    }
}      