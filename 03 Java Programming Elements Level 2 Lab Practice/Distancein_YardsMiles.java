import java.util.Scanner;
public class Distancein_YardsMiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in foot :");
         double  Distance_feet = sc.nextDouble();

         double FeetPerYard=3.0;
         double YardsPerMiles=1760.0;

         double DistanceinYards = Distance_feet/FeetPerYard;
         double DistanceinMiles = DistanceinYards/YardsPerMiles;

         System.out.println("The distance in feet is "+Distance_feet+ " , Distance in Yards is "+DistanceinYards +" and in miles is "+DistanceinMiles);




    }
}
