import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        int maxAttempts = 7; // You can adjust the maximum attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've chosen a number between " + minRange + " and " + maxRange + ".");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                break; // Exit the loop since the user guessed correctly
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("You've run out of attempts. The number was " + numberToGuess + ".");
        }

        scanner.close(); // Close the scanner to release resources
    }
}
