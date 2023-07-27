package com.example;

import java.util.Scanner;

/**
 * The UserInputHandler class handles user input and validation.
 * It ensures that the user enters a valid number within the specified range
 * and provides error handling for invalid inputs.
 */
public class UserInputHandler {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_ATTEMPTS = 3;
    private Scanner scanner;

    /**
     * Constructs a new UserInputHandler with a Scanner object.
     */
    public UserInputHandler() {
        scanner = new Scanner(System.in);
    }

    /**
     * Gets a valid guess from the user.
     *
     * @return The valid guess entered by the user.
     */
    public int getValidGuess() {
        int guess = 0;
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Guess the number: ");
            String input = scanner.nextLine();

            try {
                guess = Integer.parseInt(input);

                if (guess < MIN_NUMBER || guess > MAX_NUMBER) {
                    System.out.println("Invalid input. Please enter a number between "
                                       + MIN_NUMBER + " and " + MAX_NUMBER + ".");
                } else {
                    return guess; // Return the valid guess
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }

            attempts++;
        }

        System.out.println("You have exceeded the maximum number of attempts. Exiting the game.");
        closeScanner();
        System.exit(0);
        return guess;
    }

    /**
     * Closes the Scanner object used for user input.
     */
    public void closeScanner() {
        scanner.close();
    }
}
