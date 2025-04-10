package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();

}
