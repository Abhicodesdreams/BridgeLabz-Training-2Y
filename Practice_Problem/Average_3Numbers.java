import java.util.Scanner;
public class Average_3Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Value of num1 :");
        int num1 = sc.nextInt();

        System.out.print("Value of num2 :");
        int num2 = sc.nextInt();

        System.out.print("Value of num3 :");
        int num3 = sc.nextInt();

        int Avg = (num1+num2+num3)/3;

        System.out.println("The average of 3 numbers is : "+Avg);

    }
}
