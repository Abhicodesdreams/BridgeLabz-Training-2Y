import java.util.Scanner;
public class Quotient_Remainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 number :");
         int number1 = sc.nextInt();

         System.out.print("Enter 2 number :");
         int number2 = sc.nextInt();

         int Quotient = number1/number2;
         int Remainder = number1%number2;

         System.out.println("The quotient is "+Quotient+ " and the Remainder is "+Remainder+" of two numbers "+number1+ " and "+number2);

    }
}
