package misc;

import java.util.Random;

public class UnfairCoin {

    private Random r = new Random();

    boolean flip() {
        return (r.nextInt(3) == 1 || r.nextInt(3) == 2);
    }

    void trials(int total) {
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < total; i++) {
            if (flip())
                heads++;
            else
                tails++;
        }

        System.out.printf("%d heads, %d tails\n", heads, tails);

        double percent = 100 * (heads + 0.0) / (total + 0.0);
        System.out.printf("%f%% of the flips were heads.", percent);

    }

    public static void main(String[] args) {
        new UnfairCoin().trials(100000);
    }
}
