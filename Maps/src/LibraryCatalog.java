import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {

        Map<String, String> books = new HashMap<>();

        books.put("978-1111111111", "Java Basics");
        books.put("978-2222222222", "Python Guide");
        books.put("978-3333333333", "DSA Handbook");

        // Search by ISBN
        String isbn = "978-2222222222";
        System.out.println(books.getOrDefault(isbn, "Book not found"));

        // Remove a book
        books.remove("978-3333333333");

        // Sorted by ISBN
        TreeMap<String,String> sorted = new TreeMap<>(books);
        System.out.println(sorted);

        // Search by title
        String title = "Java Basics";
        boolean found = false;

        for (String key : books.keySet()) {
            if (books.get(key).equals(title)) {
                System.out.println("Found ISBN: " + key);
                found = true;
                break;
            }
        }

        if (!found) System.out.println("Title not found");
    }
}
