import java.util.Scanner;
public class FactorsOfNum_WhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int counter = 1;

        if (n > 0) {
            System.out.println("the factors of " + n + " are :");
            while (counter <= n) {
                if (n % counter == 0) {
                    System.out.println(counter);

                }
                counter++;
            }
        } else {
            System.out.print(" Kindly , Enter a positive number ");
        }
    }

    }

