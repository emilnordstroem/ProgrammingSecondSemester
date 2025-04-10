package opgave01.models.beverages;

public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
