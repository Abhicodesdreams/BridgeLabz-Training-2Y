import java.util.*;

class Order {
    int id;
    Order(int id) { this.id = id; }
    public boolean equals(Object o) { return this.id == ((Order)o).id; }
    public int hashCode() { return id; }
    public String toString() { return "Order " + id; }
}

public class ECommerceOrderSystem {
    public static void main(String[] args) {

        List<Order> allOrders = new ArrayList<>(List.of(
                new Order(1), new Order(2), new Order(1), new Order(3)
        ));

        // remove duplicates
        Set<Order> unique = new HashSet<>(allOrders);

        // queue for processing
        Queue<Order> processingQueue = new LinkedList<>(unique);

        // stack for failed ones
        Stack<Order> failed = new Stack<>();

        while (!processingQueue.isEmpty()) {
            Order o = processingQueue.remove();
            System.out.println("Processing " + o);

            if (o.id == 2) { // fail id=2
                System.out.println("Failed → pushing to stack");
                failed.push(o);
            }
        }

        System.out.println("Retry failed orders:");
        while (!failed.isEmpty()) {
            System.out.println("Retry: " + failed.pop());
        }
    }
}
