package opgave02.models;

public class Book {
    private final BookType bookType;
    private final double price;
    private final String title;

    public Book(BookType bookType, double price, String title) {
        this.bookType = bookType;
        this.price = price;
        this.title = title;
    }

    public BookType getBookType() {
        return bookType;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}