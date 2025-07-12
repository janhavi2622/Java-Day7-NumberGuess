package day7;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println(" Welcome to the Number Guessing Game!");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // 1 to 100
            int maxAttempts = 7;
            int attempts = 0;
            boolean hasWon = false;

            System.out.println("\n I have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.\n");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess;

                // Input validation
                try {
                    userGuess = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                    continue;
                }

                attempts++;

                if (userGuess == numberToGuess) {
                    hasWon = true;
                    break;
                } else {
                    int difference = Math.abs(userGuess - numberToGuess);

                    if (userGuess < numberToGuess) {
                        System.out.println("Too low!");
                    } else {
                        System.out.println("Too high!");
                    }

                    if (difference <= 5) {
                        System.out.println("You're very close!");
                    }

                    System.out.println("Attempts left: " + (maxAttempts - attempts) + "\n");
                }
            }

            if (hasWon) {
                int score = 100 - (attempts - 1) * 10;
                System.out.println("\n Congratulations! You guessed the number in " + attempts + " attempts.");
                System.out.println(" Your score: " + score + "/100");
            } else {
                System.out.println("\n Game Over! The correct number was: " + numberToGuess);
            }

            // Ask if user wants to play again
            System.out.print("\n Do you want to play again? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
        }

        System.out.println("\n  Thanks for playing! Goodbye!");
        scanner.close();
    }
}
