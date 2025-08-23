import java.util.Scanner;
public class Calculator_SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number :");
        int first = sc.nextInt();

        System.out.print("Enter second number :");
        int second = sc.nextInt();

        System.out.print("Enter operator :(+ , - , * , /): ");
         String op = sc.next();

         int result;

         switch(op){
             case "+":
                 result=first+second;
                 System.out.println("Result : "+result);
                 break;

             case "-":
                 result = first-second;
                 System.out.println("Result : "+result);
                 break;
             case "*":
                 result = first*second;
                 System.out.println("Result : "+result);
                 break;
             case "/":
                 if(second!=0){
                     result = first/second;
                     System.out.println("Result : "+result);
                 }
                 else{
                     System.out.println("Division by zero : Error raised");
                 }
                 break;

             default:
                 System.out.println("Invalid Operator entered");
         }

    }
}
