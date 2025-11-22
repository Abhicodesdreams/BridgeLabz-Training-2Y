class Fruit { }
class Apple extends Fruit { }
class Mango extends Fruit { }
// class Car {}  // Not allowed in FruitBox

public class FruitBox<T extends Fruit> {
    private T item;

    public void add(T item) {
        this.item = item;
    }

    public void display() {
        System.out.println("Stored: " + item.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        FruitBox<Apple> fb1 = new FruitBox<>();
        fb1.add(new Apple());
        fb1.display();

        FruitBox<Mango> fb2 = new FruitBox<>();
        fb2.add(new Mango());
        fb2.display();

        // FruitBox<Car> fb3 = new FruitBox<>();  // ❌ Compile error
    }
}
