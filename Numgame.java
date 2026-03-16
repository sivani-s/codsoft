import java.util.*;

public class Numgame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Enter maximum range (e.g., 100): ");
        int maxRange = s.nextInt();
        int num = rand.nextInt(maxRange) + 1;
        
        int attempts = 0;
        int maxAttempts = 5;
        boolean guessed = false;

        System.out.println("Guess the number (1-" + maxRange + "): You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            int guess = s.nextInt();
            attempts++;
            
            if (guess < num) {
                System.out.println("Too low!");
            } else if (guess > num) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! Attempts: " + attempts);
                int score = 100 - (attempts * 10);
                System.out.println("Your score: " + score);
                guessed = true;
                break;
            }
        }

        if (!guessed) {
            System.out.println("Sorry, you ran out of attempts. The number was: " + num);
        }
    }
}
