package com.example;

/**
 * The GameLogic class represents the core logic of the number guessing game.
 * It contains methods for managing the game state, processing user inputs,
 * and providing feedback to the user.
 */
public class GameLogic {
    private int randomNumber;
    private int attempts;
    private boolean isGameFinished;

    /**
     * Constructs a new GameLogic with the given randomly generated number.
     *
     * @param randomNumber The randomly generated number that the user needs to guess.
     */
    public GameLogic(int randomNumber) {
        this.randomNumber = randomNumber;
        this.attempts = 0;
        this.isGameFinished = false;
    }

    /**
     * Checks if the game is finished or not.
     *
     * @return True if the game is finished, false otherwise.
     */
    public boolean isGameFinished() {
        return isGameFinished;
    }

    /**
     * Plays the number guessing game with the user's guessed number.
     * Compares the guessed number with the randomly generated number
     * and provides feedback to the user.
     *
     * @param guessedNumber The user's guessed number.
     */
    public void playGame(int guessedNumber) {
        attempts++;

        if (guessedNumber == randomNumber) {
            System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            isGameFinished = true;
        } else if (guessedNumber < randomNumber) {
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Too high! Try again.");
        }
    }

    /**
     * Resets the game by generating a new random number and resetting attempts and game state.
     */
    public void resetGame() {
        this.randomNumber = new RandomNumberGenerator().generateRandomNumber();
        this.attempts = 0;
        this.isGameFinished = false;
    }
}
