import java.util.*;

class Player {
    String name;
    Player(String n) { name = n; }

    public boolean equals(Object o) { return this.name.equals(((Player)o).name); }
    public int hashCode() { return name.hashCode(); }

    public String toString() { return name; }
}

class Match {
    Player p1;
    Player p2;
    Match(Player a, Player b) { p1 = a; p2 = b; }
    public String toString() { return p1 + " vs " + p2; }
}

class Score implements Comparable<Score> {
    String player;
    int points;

    Score(String p, int pts) { player = p; points = pts; }

    public int compareTo(Score s) { return s.points - this.points; } // descending
    public String toString() { return player + ": " + points; }
}

public class TournamentTracker {
    public static void main(String[] args) {

        // 1. Register players (unique)
        Set<Player> players = new HashSet<>();
        players.add(new Player("A"));
        players.add(new Player("B"));
        players.add(new Player("C"));
        players.add(new Player("A")); // duplicate ignored

        // 2. Queue for upcoming matches
        Queue<Match> matchQueue = new LinkedList<>();
        matchQueue.add(new Match(new Player("A"), new Player("B")));
        matchQueue.add(new Match(new Player("B"), new Player("C")));
        matchQueue.add(new Match(new Player("C"), new Player("A")));

        // 3. List to store results
        List<Score> results = new ArrayList<>();

        // 4. TreeSet for live leaderboard
        TreeSet<Score> leaderboard = new TreeSet<>();

        System.out.println("Processing matches...");
        while (!matchQueue.isEmpty()) {
            Match m = matchQueue.remove();
            System.out.println("Match: " + m);

            // Simulate random winner
            Player winner = Math.random() > 0.5 ? m.p1 : m.p2;
            System.out.println("Winner: " + winner);

            results.add(new Score(winner.name, 10)); // 10 pts each win
        }

        // Build leaderboard
        for (Score s : results) leaderboard.add(s);

        System.out.println("\nFinal Results:");
        for (Score s : results) System.out.println(s);

        System.out.println("\nLeaderboard:");
        for (Score s : leaderboard) System.out.println(s);
    }
}
