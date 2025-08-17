public class ProfitLoss {
    public static void main(String[] args) {

        int Costprice = 129;
        int Sellingprice = 191;

        int Profit = Sellingprice-Costprice;
        float ProfitPercentage = ((float)Profit/Costprice) * 100;
        System.out.println("The Cost Price is INR "+Costprice+" and Selling Price is INR "+Sellingprice);
        System.out.println("The profit is INR "+Profit+" and the Profit Percentage is "+ProfitPercentage);


    }
}
