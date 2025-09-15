import java.util.Scanner;
public class FibonacciGenerator {
    public static void printFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: " + a + " " + b);

        for (int i = 2; i < terms; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();
        printFibonacci(terms);
    }

}
