import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount :"); // in rupees
        double P = sc.nextDouble();

        System.out.print("Enter at what rate :"); // in percentage
        double R = sc.nextDouble();

        System.out.print("Enter for how much time :");  // in years
        double  T =  sc.nextDouble();

        double SI = (P*R*T)/100;

        System.out.print("The simple interest is : "+SI+" Rupees");
    }
}
