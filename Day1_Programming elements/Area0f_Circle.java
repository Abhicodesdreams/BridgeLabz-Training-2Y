import java.util.Scanner;
public class Area0f_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle in cm's :");
        float Radius = sc.nextFloat();

        double  Area = Math.PI *  Math.pow(Radius,2);

        System.out.println("The area of circle is : "+Area+" sq cm");

    }
}
