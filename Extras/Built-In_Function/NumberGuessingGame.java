import java.util.*;
public class NumberGuessingGame {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static int generateGuess() {
        return random.nextInt(100) + 1; // 1 to 100
    }

    public static String getUserFeedback(int guess) {
        System.out.print("Is your number " + guess + "? (Enter: high / low / correct): ");
        return scanner.nextLine().toLowerCase();
    }

    public static void playGame() {
        int guess;
        String feedback;

        do {
            guess = generateGuess();
            feedback = getUserFeedback(guess);
        } while (!feedback.equals("correct"));

        System.out.println("Yay! I guessed your number: " + guess);
    }

    public static void main(String[] args) {
        playGame();
    }

}
