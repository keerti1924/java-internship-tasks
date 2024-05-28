import java.util.Scanner;
public class GuessingGame {

    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 100) + 1; // Generate random number between 1 and 100
        int guessCount = 0; // Track guess attempts

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter your guessing number (1-100): ");
            int guess = scanner.nextInt();
            guessCount++;

            if (guess == targetNumber) {
                System.out.println("\nCongratulations! You guessed the number in " + guessCount + " tries.\n");
                break;
            } else if (guess < targetNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }

    }
}