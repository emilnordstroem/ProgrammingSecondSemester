package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + " with Mocha";
    }

    @Override
    public double cost() {
        return super.beverage.cost() + 0.20;
    }
}
