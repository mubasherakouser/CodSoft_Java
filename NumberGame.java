import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int attempts = 10;
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + minRange + " and " + maxRange + ".");

        while (playAgain) {
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            int attemptCount = 0;
            
            System.out.println("You have " + attempts + " attempts to guess the number.");
            
            while (attemptCount < attempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
                    score++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                
                attemptCount++;
            }
            
            if (attemptCount == attempts) {
                System.out.println("Out of attempts. The correct number was: " + numberToGuess);
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }
        System.out.println("Thanks for playing! ");
        System.out.println("Your score: " + score + " rounds won.");
        scanner.close();
    }
}
 