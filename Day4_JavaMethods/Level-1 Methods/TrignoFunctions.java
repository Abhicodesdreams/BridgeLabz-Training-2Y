import java.util.Scanner;
public class TrignoFunctions {

    static double[] CalculateTrigno(double angle){
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle : ");

        double angle = sc.nextDouble();

       double[] result = CalculateTrigno(angle);

        System.out.println("Sine: " + result[0] + ", Cosine: " +result[1] + ", Tangent: " + result[2]);

    }
}
