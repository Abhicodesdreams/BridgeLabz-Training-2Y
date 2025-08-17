import java.util.Scanner;
public class FeeDiscount_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your University fees Amount :");
        double UnivFee= sc.nextDouble();

        System.out.print("Enter your mentioned Discount percentage :");
        double DiscountPercent = sc.nextDouble();

        double Discount_granted = (DiscountPercent/100)*UnivFee;

        double Final_Fees = UnivFee-Discount_granted;

        System.out.println("The discount amount is INR "+Discount_granted+" and final discounted fee is INR "+Final_Fees);

    }
}
