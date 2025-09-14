import java.util.Scanner;

public class ChocolateDistribution {

        public static int[] distributeChocolates(int chocolates, int children) {
            int quotient = chocolates / children;
            int remainder = chocolates % children;
            return new int[]{quotient, remainder};
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter chocolates and children: ");
            int chocolates = sc.nextInt(), children = sc.nextInt();

            int[] dist = distributeChocolates(chocolates, children);
            System.out.println("Each child gets: " + dist[0] + ", Remaining: " + dist[1]);
        }
    }


