import java.util.Scanner;
public class PowerOfNumber_WhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and power :");

        int number = sc.nextInt();  // base
        int power = sc.nextInt();  // power

        //  Additionally , adding edge case of number^0 = 1 always !

        int result = 1;
        if (power == 0) {
            if (number == 0) {
                System.out.println("0 raised to the power 0 is undefined");
            } else {
                System.out.println(number + " raised to the power 0 is always : " + result);
            }
        } else {
            if (number > 0 && power > 0) {
                int i = 1;
                while (i <= power) {
                    result = result * number;
                    i++;
                }

            }
            System.out.println(number + " raised to the power " + power + " is : " + result);
        }
    }
}
