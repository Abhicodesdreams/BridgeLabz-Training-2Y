import java.util.*;

class Product {
    double price;
    Product(double price){ this.price = price; }
    double getPrice(){ return price; }
}

class Mobile extends Product { Mobile(double p){ super(p); } }
class Laptop extends Product { Laptop(double p){ super(p); } }

public class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double sum = 0;
        for (Product p : items) sum += p.getPrice();
        return sum;
    }

    public static void main(String[] args) {
        List<Mobile> m = List.of(new Mobile(10000), new Mobile(15000));
        List<Laptop> l = List.of(new Laptop(50000), new Laptop(60000));

        System.out.println(calculateTotal(m));
        System.out.println(calculateTotal(l));
    }
}
