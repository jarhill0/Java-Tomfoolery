package Minesweeper;

import java.util.Random;

public class Board {
    static final int WIDTH = 9;
    static final int HEIGHT = 9;

    private boolean gameOver = false;
    private boolean playerWon;

    private boolean[][] mines = new boolean[HEIGHT][WIDTH];
    private int mineCount;
    private int[][] board = new int[HEIGHT][WIDTH];


    private static String repr(boolean mine) {
        return mine ? "M" : ".";
    }

    private static String repr(int square) {
        if (square >= 1)
            return String.valueOf(square);
        if (square == 0)
            return " ";
        if (square == -1)
            return "F"; //flagged
        return "#";
    }

    private static int[][] getSurroundings(int x, int y) {

        // corner cases (lol)
        if (x == 0 && y == 0) {
            return new int[][]{{1, 0}, {1, 1}, {0, 1}};
        }
        if (x == 0 && y == HEIGHT - 1) {
            return new int[][]{{0, y - 1}, {1, y - 1}, {1, y}};
        }
        if (x == WIDTH - 1 && y == 0) {
            return new int[][]{{x - 1, 0}, {x - 1, 1}, {x, 1}};
        }
        if (x == WIDTH - 1 && y == HEIGHT - 1) {
            return new int[][]{{x - 1, y}, {x - 1, y - 1}, {x, y - 1}};
        }

        // edge cases (haha)
        if (x == 0) {
            return new int[][]{{0, y - 1}, {1, y - 1}, {1, y}, {1, y + 1}, {0, y + 1}};
        }
        if (x == WIDTH - 1) {
            return new int[][]{{x, y - 1}, {x - 1, y - 1}, {x - 1, y}, {x - 1, y + 1}, {x, y + 1}};
        }
        if (y == 0) {
            return new int[][]{{x - 1, 0}, {x - 1, 1}, {x, 1}, {x + 1, 1}, {x + 1, 0}};
        }
        if (y == HEIGHT - 1) {
            return new int[][]{{x - 1, y}, {x - 1, y - 1}, {x, y - 1}, {x + 1, y - 1}, {x + 1, y}};
        }

        // not edge or corner
        return new int[][]{{x - 1, y - 1}, {x, y - 1}, {x + 1, y - 1}, {x + 1, y}, {x + 1, y + 1}, {x, y + 1}, {x - 1, y + 1}, {x - 1, y}};
    }

    public Board() {
        this(10);
    }

    public Board(int numMines) {
        mineCount = numMines;
        if (numMines < 0)
            numMines = 0;
        if (numMines > WIDTH * HEIGHT)
            numMines = WIDTH * HEIGHT;

        Random r = new Random();

        for (int i = 0; i < numMines; i++) {
            int x;
            int y;
            do {
                y = r.nextInt(HEIGHT);
                x = r.nextInt(WIDTH);
            } while (mines[y][x]);

            mines[y][x] = true;
        }

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++)
                board[y][x] = -2; // covered square
        }
    }

    public void printMines() {
        for (boolean[] row : mines) {
            for (boolean m : row) {
                System.out.print(repr(m));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void printBoard() {
        for (int[] row : board) {
            for (int s : row) {
                System.out.print(repr(s));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private int getNumMines(int x, int y) {
        int mineCount = 0;
        for (int[] surr : getSurroundings(x, y)) {
            if (mines[surr[1]][surr[0]])
                mineCount++;
        }
        return mineCount;
    }

    public boolean reveal(int x, int y) {
        if (gameOver)
            return false;
        if (board[y][x] >= -1) // already revealed, or flagged
            return false;
        if (mines[y][x]) {
            gameOver = true;
            playerWon = false;

        } else {
            board[y][x] = getNumMines(x, y);
            if (checkPlayerWon()) {
                gameOver = true;
                playerWon = true;
            }
        }
        return true;
    }

    public boolean flag(int x, int y) {
        if (board[y][x] < -1) { // hidden
            board[y][x] = -1;
            return true;
        }
        return false;
    }

    public boolean unFlag(int x, int y) {
        if (board[y][x] == -1) {
            board[y][x] = -2;
            return true;
        }
        return false;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public boolean isPlayerWon() {
        if (!gameOver)
            return false;
        return playerWon;
    }

    private boolean checkPlayerWon() {
        int hiddenCount = 0;
        for (int[] row : board) {
            for (int square : row) {
                if (square < 0) {
                    // hidden OR flagged
                    hiddenCount++;
                }
            }

            // short circuit a little
            if (hiddenCount > mineCount) {
                return false;
            }
        }
        return hiddenCount == mineCount;
    }

    private static void clearScreen() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.flush();
    }

    public void playHelper(int x, int y) {
        reveal(x, y);
        clearScreen();
        printBoard();
    }


}
