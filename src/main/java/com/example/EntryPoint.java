package com.example;

import java.util.Scanner;

/**
 * The EntryPoint class represents the entry point of the Number Guessing Game application.
 * It allows the user to play the game and handles the game loop.
 */
public final class EntryPoint {
    private EntryPoint() {
        // Private constructor to prevent instantiation of the utility class.
    }

    /**
     * Enum representing the play again options.
     */
    private enum PlayAgainOption {
        YES, NO
    }

    /**
     * The main method to start the Number Guessing Game.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("A random number between 1 and 100 has been selected.");
        System.out.println("Can you guess the number? Let's find out!");

        boolean playAgain = true;

        while (playAgain) {
            int secretNumber = randomNumberGenerator.generateRandomNumber();
            GameLogic gameLogic = new GameLogic(secretNumber);

            while (!gameLogic.isGameFinished()) {
                System.out.print("Enter your guess: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Consume the invalid input
                }
                int guessedNumber = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character after reading the integer

                gameLogic.playGame(guessedNumber);
            }

            PlayAgainOption playAgainOption;

            do {
                System.out.print("Do you want to play again? (YES/NO): ");
                String input = scanner.nextLine().trim().toUpperCase();
                try {
                    playAgainOption = PlayAgainOption.valueOf(input);
                } catch (IllegalArgumentException e) {
                    playAgainOption = null;
                }
            } while (playAgainOption == null);

            playAgain = playAgainOption == PlayAgainOption.YES;
        }

        scanner.close();
        System.out.println("Thank you for playing the Number Guessing Game. Goodbye!");
    }
}
