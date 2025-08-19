import java.util.Scanner;
public class Kilometres_to_Miles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your distance in Km's :");
          double Distance_Kms = sc.nextDouble();

           double conversion_fac = 1.6;

           double Distance_Miles = Distance_Kms/conversion_fac;

           System.out.println("The total miles is "+Distance_Miles+" for the given "+Distance_Kms+" km");
    }
}
