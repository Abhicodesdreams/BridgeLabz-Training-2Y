import java.util.*;
public class DeckOfCards {
    static String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public static String[] initializeDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int count = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[count++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int r = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static void distribute(String[] deck, int n, int players) {
        if (n % players != 0) {
            System.out.println("Cannot distribute evenly.");
            return;
        }
        int cardsPerPlayer = n / players;
        int index = 0;
        for (int p = 1; p <= players; p++) {
            System.out.println("Player " + p + ":");
            for (int c = 0; c < cardsPerPlayer; c++) {
                System.out.println("  " + deck[index++]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        distribute(deck, n, players);
    }

}
