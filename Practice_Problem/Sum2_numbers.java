import java.util.Scanner;
public class Sum2_numbers {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter both the numbers :");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int sum = num1+num2;

      System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
    }
}
