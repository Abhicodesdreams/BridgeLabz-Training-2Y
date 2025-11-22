import java.util.ArrayList;
import java.util.List;

public class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }
    public void displayItems() { System.out.println(items); }

    public static void main(String[] args) {
        Cart<String> electronics = new Cart<>();
        electronics.addItem("Laptop");
        electronics.addItem("Phone");
        electronics.displayItems();

        Cart<String> clothes = new Cart<>();
        clothes.addItem("Shirt");
        clothes.addItem("Pants");
        clothes.displayItems();
    }
}
