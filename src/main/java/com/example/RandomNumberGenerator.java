package com.example;

import java.util.Random;

/**
 * The RandomNumberGenerator class is responsible for generating the random number
 * that the user needs to guess. It uses the java.util.Random class to generate
 * the random number within the specified range.
 */
public class RandomNumberGenerator {

    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;
    private final Random random;

    /**
     * Constructs a new RandomNumberGenerator.
     */
    public RandomNumberGenerator() {
        random = new Random();
    }

    /**
     * Generate a random number within the specified range.
     *
     * @return The randomly generated number.
     */
    public int generateRandomNumber() {
        return random.nextInt(MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER + 1) + MIN_RANDOM_NUMBER;
    }
}
