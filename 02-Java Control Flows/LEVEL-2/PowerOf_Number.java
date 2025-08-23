import java.util.Scanner;
public class PowerOf_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of base and power :");
        int number = sc.nextInt(); // base
        int power = sc.nextInt(); // exponent

        int result = 1;

        // here , I am additionally adding an edge case when power is O , WKT answer will be 1 always !

        if (power == 0) {
            if (number == 0) {
                System.out.println("0 raised to the power 0 is not defined yet");
            } else {
                System.out.println(number + " raised to the power 0 is always : " + result);
            }
        } else {


            if (number > 0 && power > 0) {
                for (int i = 1; i <= power; i++) {
                    result = result * number;
                }
                System.out.println(number + " raised to the power " + power + " is : " + result);

            } else {
                System.out.println("Give positive input for both power and number ");
            }
        }
    }
}
