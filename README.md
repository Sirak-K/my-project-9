
# Number Guessing Game

## Table of Contents

- [Project Description](#project-description)
- [Features](#features)
- [How to Install](#how-to-install)
- [How to Use](#how-to-use)
- [How to Test](#how-to-test)
- [Technologies Used](#technologies-used)
- [License](#license)
- [Contact](#contact)

## Project Description

The Number Guessing Game is a simple Java application that allows users to play a game where they have to guess a randomly generated number within a specified range. The game provides feedback to the user after each guess, helping them determine whether their guess was too high, too low, or correct. The objective of the game is to guess the number correctly within a limited number of attempts.

## Features

- Randomly generates a secret number for the user to guess.
- Provides feedback to the user after each guess (too high, too low, or correct).
- Limits the number of attempts the user can make.
- Allows the user to play the game multiple times.

## How to Install

1. Ensure you have Java installed on your computer.
2. Clone this repository to your local machine using the following command:
   ```
   git clone https://github.com/Sirak-K/my-project-9.git
   ```
   - If you prefer, you can also download the ZIP file of the repository by clicking on the "Code" button on this page and then selecting "Download ZIP."

## How to Use

To play the Number Guessing Game, follow these steps:

1. Open a terminal or command prompt and navigate to the project directory.
2. Compile the Java source files using the following command:
   ```
   javac com/example/*.java
   ```
3. Run the game using the following command:
   ```
   java com.example.EntryPoint
   ```

Alternatively, if you have Maven installed, you can run the game using the following command:
   ```
   mvn package
   java -jar target/guessing-game-1.0-SNAPSHOT.jar
   ```

## How to Test

The Number Guessing Game has been thoroughly tested using JUnit tests. To run the tests, follow these steps:

1. Open a terminal or command prompt and navigate to the project directory.
2. Make sure you have Maven installed on your computer.
3. Run the tests using the following command:
   ```
   mvn test
   ```

## Test Cases

The following table presents the test cases for the Number Guessing Game:

| Test Number | Test Case                | Description                                           | Expected Outcome                                    |
|-------------|--------------------------|-------------------------------------------------------|-----------------------------------------------------|
| TEST-1      | testCorrectGuess         | Test the correct guess scenario                      | Game should finish with a "Congratulations!" message. |
| TEST-2      | testIncorrectGuessLow    | Test the incorrect guess scenario (too low)         | Game should provide a "Too low! Try again." message. |
| TEST-3      | testIncorrectGuessHigh   | Test the incorrect guess scenario (too high)        | Game should provide a "Too high! Try again." message. |
| TEST-4      | testMaxAttemptsExceeded  | Test the maximum number of attempts scenario        | Game should not finish and allow more attempts.     |
| TEST-5      | testMultipleCorrectGuesses| Test the game finish after multiple correct guesses| Game should finish with a "Congratulations!" message. |
| TEST-6      | testIncorrectGuessesInRow| Test the game finish with incorrect guesses in a row| Game should not finish and allow more attempts.     |
| TEST-7      | testCorrectAndIncorrectGuesses| Test the game finish with correct and incorrect guesses | Game should finish with a "Congratulations!" message. |
| TEST-8      | testSingleAttempt        | Test the game finish with a single attempt          | Game should provide a "Too high/low! Try again." message. |
| TEST-9      | testMaxPossibleValue     | Test the game finish with the maximum possible value| Game should not finish and allow more attempts.     |

## Technologies Used

- Java
- JUnit (for testing)

## License

This project is licensed under the MIT License.

## Contact

For any questions or feedback, please contact [sirak.dev@gmail.com](mailto:sirak.dev@gmail.com).
