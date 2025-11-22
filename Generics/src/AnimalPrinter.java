import java.util.*;

class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }

public class AnimalPrinter {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals)
            System.out.println(a.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        printAnimals(List.of(new Dog(), new Dog()));
        printAnimals(List.of(new Cat(), new Cat()));
    }
}
