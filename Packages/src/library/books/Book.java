package library.books;

public class Book {
    private String id;
    private String title;
    private boolean isIssued;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isIssued() { return isIssued; }

    public void setIssued(boolean issued) { this.isIssued = issued; }

    @Override
    public String toString() {
        return id + ": " + title + (isIssued ? " [ISSUED]" : " [AVAILABLE]");
    }
}
