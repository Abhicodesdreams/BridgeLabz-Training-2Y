import java.util.*;

    abstract class Product {
        private int id;
        private String name;
        private double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }


        public abstract double getDiscountedPrice();


        public void displayProductInfo() {
            System.out.println("Product ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Base Price: " + price);
            System.out.println("Discounted Price: " + getDiscountedPrice());
        }

        // equals() → Products equal if ID matches
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Product)) return false;
            Product other = (Product) obj;
            return this.id == other.id;
        }
    }

    // Step 2: Subclasses
    class OrganicProduct extends Product {
        public OrganicProduct(int id, String name, double price) {
            super(id, name, price);
        }

        @Override
        public double getDiscountedPrice() {
            return getPrice() - (getPrice() * 0.10); // 10% discount
        }

        @Override
        public String toString() {
            return "Product ID: " + getId() + ", Name: " + getName() +
                    ", Base Price: " + getPrice() +
                    ", Discounted Price: " + getDiscountedPrice();
        }
    }

    class RecycledProduct extends Product {
        public RecycledProduct(int id, String name, double price) {
            super(id, name, price);
        }

        @Override
        public double getDiscountedPrice() {
            return getPrice() - (getPrice() * 0.05); // 5% discount
        }

        @Override
        public String toString() {
            return "Product ID: " + getId() + ", Name: " + getName() +
                    ", Base Price: " + getPrice() +
                    ", Discounted Price: " + getDiscountedPrice();
        }
    }

    class Cart {
        private List<Product> products = new ArrayList<>();
        private static int totalCartsCreated = 0;
        public static final double TAX_RATE = 0.05; // 5% GST

        public Cart() {
            totalCartsCreated++;
        }


        public void addItem(Product p) {
            products.add(p);
            System.out.println("Added Product: " + p.getName());
        }

        // Add multiple products
        public void addItem(Product... items) {
            for (Product p : items) {
                products.add(p);
                System.out.println("Added Product: " + p.getName());
            }
        }


        public void addItem(int productId, int quantity) {
            System.out.println("Added " + quantity + " units of Product ID " + productId);
        }


        public void printCartItems() { // The non-static method to print carts
            System.out.println("Items in Cart:");
            for (Product p : products) {
                System.out.println(p);
            }
        }


        public static int getCartCount() {
            return totalCartsCreated;
        }

        // Now , I am going to Print the bill , so I will make functions accordingly !
        public final void printBillHeader() {
            System.out.println("******* EcoCart Bill ********");
        }

        // Printing the Bill :-

        public void printBill() {
            printBillHeader(); // here , I AM CALLING BILL HEADER TO PRINT THE BILL STATEMENT HEADING !
            double grandTotal = 0;
            for (Product p : products) {
                double price = p.getDiscountedPrice();
                double tax = price * TAX_RATE;
                double total = price + tax;
                grandTotal += total;
                System.out.println("Item: " + p.getName() + ", Price: " + price + ", Tax: " + tax + ", Total: " + total);
            }

            System.out.println("Grand Total: " + grandTotal);
        }
    }


    final class EcoRules {
        public static void printRules() {
            System.out.println("Use eco-friendly bags.");
            System.out.println("Recycle waste responsibly.");
        }
    }


    public class EcoCartSystem {
        public static void main(String[] args) {
            // Create products
            Product p1 = new OrganicProduct(101, "Organic Apple", 100);
            Product p2 = new RecycledProduct(201, "Recycled Notebook", 200);
            Product p3 = new OrganicProduct(102, "Organic Banana", 50);

            // Display product info
            System.out.println("Displaying Product Info (Using displayProductInfo)");
            p1.displayProductInfo();
            p2.displayProductInfo();
            p3.displayProductInfo();

            System.out.println();

            // Here , I am adding products to the cart

            System.out.println("Adding Products to Cart");
            Cart cart1 = new Cart();
            Cart cart2 = new Cart();

            cart1.addItem(p1);
            cart1.addItem(p2, p3);
            cart1.addItem(101, 3);

              System.out.println();

            System.out.println("Printing Cart Items (printCartItems)");
            cart1.printCartItems();

            System.out.println();


            System.out.println("Using Static Method (Cart.getCartCount())");
            System.out.println("Total carts created: " + Cart.getCartCount());

            System.out.println();


            System.out.println(" Printing Bill (Using TAX_RATE)");
            cart1.printBill();

            System.out.println();


            System.out.println(" Using EcoRules Class");
            EcoRules.printRules();
        }
    }


