import java.util.Scanner;
public class Perimeter_Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length :"); // in cm
        int length = sc.nextInt();

        System.out.print("Enter Width :"); // in cm
        int width = sc.nextInt();

        int Perimeter = 2  * (length+width);

        System.out.println("The perimeter of Rectangle is : "+Perimeter+" cm");

    }
}
