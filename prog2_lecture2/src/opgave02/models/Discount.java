package opgave02.models;

public abstract class Discount {
    private final String description;

    public Discount(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double applyDiscount(double amount);
}