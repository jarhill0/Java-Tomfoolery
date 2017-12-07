package L11;

import java.util.*;

public class Monty {


    private Random randoms;
    private Contestant player;


    public Monty(boolean stay) {
        Calendar c = Calendar.getInstance();
        randoms = new Random(c.getTimeInMillis());
        player = new Contestant(randoms, stay);
    }

    // Play the game, returning 1 if the contestant wins and 0 if not.
    public boolean playGame() {
        int doorWithCar;
        int firstChoice, secondChoice;
        int goatDoor;

        doorWithCar = hideCar();
        firstChoice = playerGuess();
        goatDoor = goatDoorToShow(doorWithCar, firstChoice);
        secondChoice = newGuess(goatDoor);
        return gameResult(doorWithCar, secondChoice);
    }

    // Set up the game, returning the position of the car (chosen randomly).
    private int hideCar() {
        return randoms.nextInt(3) + 1;
    }

    // Return the contestant's first guess.
    private int playerGuess() {
        return player.guess1();
    }


    // This is called by Monty after the contestant makes his/her first guess.
    // It returns the position of a door behind which is a goat.
    private int goatDoorToShow(int doorWithCar, int chosenDoor) {
        int doorToOpen;
        if (chosenDoor == doorWithCar) {

            int r = randoms.nextInt(2);
            if (chosenDoor == 1) {
                doorToOpen = r + 2; // 2 or 3
            } else if (chosenDoor == 2) {
                doorToOpen = r * 2 + 1; // 1 or 3
            } else {
                doorToOpen = r + 1; // 1 or 2
            }
        } else {
            // The contestant has chosen a goat door.
            // Open the door that contains the other goat.
            doorToOpen = 6 - (chosenDoor + doorWithCar);
        }
        return doorToOpen;
    }

    // The contestant decides on a second guess, aided (?) by knowing that the given
    // door has a goat.  Return the updated guess.
    private int newGuess(int goatDoor) {
        return player.guess2(goatDoor);
    }


    private boolean gameResult(int doorWithCar, int secondChoice) {
        return secondChoice == doorWithCar;
    }
}
