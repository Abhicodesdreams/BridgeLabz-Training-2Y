import java.util.*;

public class ElectionVoteCounter {
    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        String[] castVotes = {
                "A", "B", "A", "C", "A", "B", "C", "A", "C", "B"
        };

        for (String c : castVotes) {
            votes.put(c, votes.getOrDefault(c, 0) + 1);
        }

        // Print results
        System.out.println(votes);

        // Find winner
        String winner = null;
        int max = -1;

        for (String c : votes.keySet()) {
            if (votes.get(c) > max) {
                max = votes.get(c);
                winner = c;
            }
        }

        System.out.println("Winner = " + winner);
    }
}
