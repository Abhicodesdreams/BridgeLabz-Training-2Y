import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryMain {
    public static void main(String[] args) {
        // Add book
        Book book1 = new Book("B001", "Introduction to Java");
        System.out.println("Added book: " + book1);

        // Register member
        Member mem1 = new Member("M100", "Sonia Patil");
        System.out.println("Registered member: " + mem1);

        // Issue book
        Transaction tx = new Transaction(book1, mem1);
        tx.issueBook();

        // Try to issue again
        tx.issueBook(); // will print already issued

        // Return book
        tx.returnBook();
    }
}
