package com.example;

import java.util.Scanner;
import java.util.Random;

public class EntryPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean isGuessed = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100 (inclusive).");
        System.out.println("Can you guess the number? Let's find out!");

        while (!isGuessed) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
                isGuessed = true;
            } else if (userGuess < secretNumber) {
                System.out.println("Your guess is too low. Try again!");
            } else {
                System.out.println("Your guess is too high. Try again!");
            }
        }

        scanner.close();
    }
}
