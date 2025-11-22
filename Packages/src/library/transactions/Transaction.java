package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    private Book book;
    private Member member;

    public Transaction(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    public boolean issueBook() {
        if (!book.isIssued()) {
            book.setIssued(true);
            System.out.println("Issued '" + book.getTitle() + "' to " + member.getName());
            return true;
        } else {
            System.out.println("Book already issued.");
            return false;
        }
    }

    public void returnBook() {
        book.setIssued(false);
        System.out.println("Returned '" + book.getTitle() + "' from " + member.getName());
    }
}
