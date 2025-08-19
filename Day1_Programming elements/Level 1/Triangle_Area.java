import java.util.Scanner;
public class Triangle_Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle (in inches ) :");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle (in inches):");
        double height = sc.nextDouble();

        // WKT , 1 inch = 2.54 cm

        double area_inch = 0.5 * base * height ;

          double base_cm = base*2.54;
          double height_cm = height*2.54;
          double area_cm = 0.5 * base_cm * height_cm;

          System.out.println("The area of triangle is "+area_inch+" square inches and "+area_cm+" square centimeters");

    }
}
