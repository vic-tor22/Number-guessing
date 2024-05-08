import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // Generate a random number between 1 and 100

        Scanner scanner = new Scanner(System.in);
        int attempts = 0; // Initialize the number of attempts

        while (attempts < 5) {
            System.out.println("Enter your guess (1-100)");
            int playerGuess = scanner.nextInt();
            attempts++;

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You win!");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("Nope! The number is higher. Guess again.");
            } else {
                System.out.println("Nope! The number is lower. Guess again.");
            }
        }

        if (attempts == 5) {
            System.out.println("Sorry, you've run out of attempts!");
            System.out.println("The correct number was: " + randomNumber);
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}

