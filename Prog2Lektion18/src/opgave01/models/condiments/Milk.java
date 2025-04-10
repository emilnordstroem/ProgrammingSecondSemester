package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "Milk";
    }

    @Override
    public double cost() {
        return super.beverage.cost() + 0.10;
    }
}
