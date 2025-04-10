package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "Soy";
    }

    @Override
    public double cost() {
        return super.beverage.cost() + 0.15;
    }
}
