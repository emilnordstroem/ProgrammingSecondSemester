package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + " with Whip";
    }

    @Override
    public double cost() {
        return super.beverage.cost() + 0.10;
    }
}
