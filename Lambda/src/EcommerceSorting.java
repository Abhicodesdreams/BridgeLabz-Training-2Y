import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | Price:" + price + " Rating:" + rating + " Discount:" + discount;
    }
}

public class EcommerceSorting {
    public static void main(String[] args) {

        List<Product> list = Arrays.asList(
                new Product("Phone", 50000, 4.6, 10),
                new Product("Shoes", 2000, 4.2, 30),
                new Product("Laptop", 70000, 4.8, 5)
        );

        System.out.println("Sort by Price:");
        list.stream().sorted((p1, p2) -> Double.compare(p1.price, p2.price))
                .forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        list.stream().sorted((p1, p2) -> Double.compare(p2.rating, p1.rating))
                .forEach(System.out::println);

        System.out.println("\nSort by Discount:");
        list.stream().sorted((p1, p2) -> Double.compare(p2.discount, p1.discount))
                .forEach(System.out::println);
    }
}
