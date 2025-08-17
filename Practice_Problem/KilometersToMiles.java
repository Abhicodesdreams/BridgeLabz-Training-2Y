import java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);

         // NOTE => 1 Mile = 1.6 Kilometers ;

         System.out.print("Enter distance in kilometers :");
         double km = sc.nextDouble();

         double miles = km/1.6;

         System.out.print("Distance in miles : "+miles+" miles");


    }
}
