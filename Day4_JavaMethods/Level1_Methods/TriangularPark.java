import java.util.*;
public class TriangularPark {

    static double calculateRounds(double side1 , double side2 , double side3, double distance){
        double perimeter = side1+side2+side3;
        return  distance/perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         double a = sc.nextDouble();
         double b = sc.nextDouble();
         double c = sc.nextDouble();

         double running_dis = 5000;  //(1km = 1000m) => 5km=5000m

         double total_round =  calculateRounds(a,b,c,running_dis);

        System.out.println(total_round);

    }
}
