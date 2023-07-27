package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for the Number Guessing Game.
 */
public class NumGameTests {
    private static final int RANDOM_NUMBER = 50;
    private static final int INCORRECT_GUESS_LOW = 30;
    private static final int INCORRECT_GUESS_HIGH = 70;
    private static final int MAX_ATTEMPTS_1 = 10;
    private static final int MAX_ATTEMPTS_2 = 20;
    private static final int CORRECT_GUESS_1 = 45;
    private static final int CORRECT_GUESS_2 = 48;
    private static final int CORRECT_GUESS_3 = 52;
    private static final int CORRECT_GUESS_4 = 55;
    private static final int MAX_NUMBER = 100;
    private static final int NUMBER_ONE = 1;
    private static final int NUMBER_TWO = 2;
    private static final int NUMBER_THREE = 3;
    private static final int NUMBER_FOUR = 4;
    private static final int NUMBER_FIVE = 5;

    private GameLogic gameLogic;

    @BeforeEach
    public void setUp() {
        // Set up a new GameLogic instance before each test
        gameLogic = new GameLogic(RANDOM_NUMBER);
    }

    // TEST-1: Test the correct guess scenario
    @Test
    public void testCorrectGuess() {
        int guessedNumber = RANDOM_NUMBER; // Correct guess (RANDOM_NUMBER is set to 50 in setUp)
        gameLogic.playGame(guessedNumber);
        assertTrue(gameLogic.isGameFinished());
    }

    // TEST-2: Test the incorrect guess scenario (too low)
    @Test
    public void testIncorrectGuessLow() {
        int guessedNumber = INCORRECT_GUESS_LOW; // Incorrect guess (too low)
        gameLogic.playGame(guessedNumber);
        assertFalse(gameLogic.isGameFinished());
    }

    // TEST-3: Test the incorrect guess scenario (too high)
    @Test
    public void testIncorrectGuessHigh() {
        int guessedNumber = INCORRECT_GUESS_HIGH; // Incorrect guess (too high)
        gameLogic.playGame(guessedNumber);
        assertFalse(gameLogic.isGameFinished());
    }

    // TEST-4: Test the maximum number of attempts scenario
    @Test
    public void testMaxAttemptsExceeded() {
        int[] guessedNumbers = {
            RANDOM_NUMBER - MAX_ATTEMPTS_1,
            RANDOM_NUMBER - MAX_ATTEMPTS_2,
            RANDOM_NUMBER + MAX_ATTEMPTS_1,
            RANDOM_NUMBER + MAX_ATTEMPTS_2
        }; // Multiple incorrect guesses
        for (int guess : guessedNumbers) {
            gameLogic.playGame(guess);
        }
        assertFalse(gameLogic.isGameFinished());
    }

    // TEST-5: Test the game finish after multiple correct guesses in a row
    @Test
    public void testMultipleCorrectGuesses() {
        int[] guessedNumbers = {
            CORRECT_GUESS_1,
            CORRECT_GUESS_2,
            RANDOM_NUMBER,
            CORRECT_GUESS_3,
            CORRECT_GUESS_4
        }; // Two incorrect guesses, one correct guess, two incorrect guesses
        for (int guess : guessedNumbers) {
            gameLogic.playGame(guess);
        }
        assertTrue(gameLogic.isGameFinished());
    }

    // TEST-6: Test the game finish with incorrect guesses in a row
    @Test
    public void testIncorrectGuessesInRow() {
        int[] guessedNumbers = {
            RANDOM_NUMBER - NUMBER_ONE,
            RANDOM_NUMBER - NUMBER_TWO,
            RANDOM_NUMBER - NUMBER_THREE,
            RANDOM_NUMBER - NUMBER_FOUR,
            RANDOM_NUMBER - NUMBER_FIVE
        }; // Five incorrect guesses in a row
        for (int guess : guessedNumbers) {
            gameLogic.playGame(guess);
        }
        assertFalse(gameLogic.isGameFinished());
    }

    // TEST-7: Test the game finish with correct and incorrect guesses
    @Test
    public void testCorrectAndIncorrectGuesses() {
        int[] guessedNumbers = {
            CORRECT_GUESS_1,
            INCORRECT_GUESS_HIGH,
            CORRECT_GUESS_2,
            INCORRECT_GUESS_LOW,
            RANDOM_NUMBER,
            INCORRECT_GUESS_LOW
        }; // Correct, incorrect, correct, incorrect, correct, incorrect
        for (int guess : guessedNumbers) {
            gameLogic.playGame(guess);
        }
        assertTrue(gameLogic.isGameFinished());
    }

    // TEST-8: Test the game finish with a single attempt
    @Test
    public void testSingleAttempt() {
        int guessedNumber = RANDOM_NUMBER + 1; // Single incorrect guess
        gameLogic.playGame(guessedNumber);
        assertFalse(gameLogic.isGameFinished());
    }

    // TEST-9: Test the game finish with the maximum possible value
    @Test
    public void testMaxPossibleValue() {
        int guessedNumber = MAX_NUMBER; // The maximum possible value (100)
        gameLogic.playGame(guessedNumber);
        assertFalse(gameLogic.isGameFinished());
    }
}
