package opgave04.models;

public class Buyer implements Observer {
    private final String name; // not empty

    public Buyer(String name) {
        this.name = name;
    }

    public void buyBook(Book book, int amount) {
        book.incCount(amount);
        System.out.println("Buyer " + name + ": " + book + ", " + amount + " copies");
    }

    @Override
    public void update(String message) {
        System.out.printf("%s recieved update: %s",
                name,
                message
        );
    }
}
