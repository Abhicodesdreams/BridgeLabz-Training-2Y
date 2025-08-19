public class UniversityFee_discount {
    public static void main(String[] args) {

        double UnivFee=125000;
        double  DiscountPercent=10;

         double  Discount = (DiscountPercent/100) * UnivFee;

         double Final_fees = UnivFee-Discount;

         System.out.println("The discount amount is INR "+Discount+" and final discounted fee is INR "+Final_fees);





    }
}
