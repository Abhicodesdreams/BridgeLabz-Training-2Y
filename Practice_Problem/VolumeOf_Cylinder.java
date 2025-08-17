import java.util.Scanner;
public class VolumeOf_Cylinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Cylinder :");
        double Radius = sc.nextDouble();

        System.out.print("Enter Height of Cylinder :");
        double Height = sc.nextDouble();

        double Cylinder_Volume = Math.PI * Math.pow(Radius,2) * Height;

        System.out.println("The volume of cylinder is :"+Cylinder_Volume+" cm cube");

    }
}
