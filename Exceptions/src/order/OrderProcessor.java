package order;

import java.util.Random;

public class OrderProcessor {

    public void placeOrder() throws OutOfStockException, PaymentFailedException {

        Random r = new Random();
        int val = r.nextInt(3); // 0,1,2

        if (val == 0) {
            throw new OutOfStockException("The product is out of stock!");
        } else if (val == 1) {
            throw new PaymentFailedException("Payment failed! Please retry.");
        } else {
            System.out.println("Order placed successfully!");
        }
    }
}
