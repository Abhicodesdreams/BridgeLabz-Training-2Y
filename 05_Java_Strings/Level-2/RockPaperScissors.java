import java.util.Scanner;
public class RockPaperScissors {
    static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
                (user.equals("Paper") && comp.equals("Rock")) ||
                (user.equals("Scissors") && comp.equals("Paper")))
            return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0, games;

        System.out.print("Enter number of games: ");
        games = sc.nextInt();

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter choice (Rock/Paper/Scissors): ");
            String user = sc.next();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            System.out.println("Game " + i + " → User: " + user + ", Computer: " + comp + " → Winner: " + winner);
        }

        System.out.println("\nFinal Results:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("User Win %: " + (userWins * 100.0 / games));
        System.out.println("Computer Win %: " + (compWins * 100.0 / games));
    }
}
