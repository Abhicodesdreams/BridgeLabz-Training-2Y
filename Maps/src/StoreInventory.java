import java.util.*;

public class StoreInventory {
    public static void main(String[] args) {

        Map<String, Integer> stock = new HashMap<>();

        // Add products
        stock.put("Milk", 10);
        stock.put("Bread", 5);
        stock.put("Eggs", 12);

        // Customer buys
        stock.put("Milk", stock.get("Milk") - 3);

        if (stock.get("Milk") <= 0) stock.put("Milk", 0);

        // Shipment arrives
        stock.put("Bread", stock.get("Bread") + 10);

        // Query
        String p = "Eggs";
        System.out.println("Stock of " + p + ": " +
                stock.getOrDefault(p, -1));

        // Out of stock items
        System.out.println("Out of stock:");
        for (String key : stock.keySet()) {
            if (stock.get(key) == 0)
                System.out.println(key);
        }
    }
}
