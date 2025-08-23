import java.util.Scanner;
public class Factorial_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.print("Enter number which factorial you want to check :");
        int  n = sc.nextInt();

        /*I used approach of for loop and then used it for writing in while loop :
         int fact = 1;
        for( int i =1;i<=n;i++){
            fact*=i;
         }
          System.out.println(fact);
         */

        // While loop Factorial Calculation :
        if(n>0) {  // here we are checking for both positive as well as natural number ;
            int i = 1;
            int fact = 1;

            while (i <= n) {
                fact = fact * i;
                i++;
            }

            System.out.println("The factorial of " + n + " is : " + fact);
        }



    }
}
