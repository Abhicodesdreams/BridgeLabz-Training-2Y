import java.util.Scanner;
public class TotalPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit price :");
        double unit_price = sc.nextDouble();

        System.out.print("Enter quantity of item :");
        double quantity = sc.nextDouble();

        double Total_price =  unit_price*quantity;

        System.out.print("The total purchase price is INR "+Total_price+" if the quantity "+quantity+" and the unit price is INR "+unit_price);

    }
}
