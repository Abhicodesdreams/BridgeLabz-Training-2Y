import java.util.Scanner;
public class MaximumOfThree {
    public static int getInput(Scanner sc) {
        return sc.nextInt();
    }

    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = getInput(sc);
        int num2 = getInput(sc);
        int num3 = getInput(sc);

        int max = findMaximum(num1, num2, num3);
        System.out.println("Maximum number is: " + max);
    }


}
