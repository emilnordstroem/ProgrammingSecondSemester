package opgave04.models;

public class Salesman implements Observer{
    private final String name; // not empty

    public Salesman(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.printf("%s reveived update: %s",
                name,
                message
        );
    }
}
