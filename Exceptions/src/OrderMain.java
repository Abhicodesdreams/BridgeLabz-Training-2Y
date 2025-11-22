import order.*;

public class OrderMain {
    public static void main(String[] args) {
        OrderProcessor op = new OrderProcessor();

        try {
            op.placeOrder();
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
