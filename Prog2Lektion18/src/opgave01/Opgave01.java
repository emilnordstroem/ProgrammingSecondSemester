package opgave01;

import opgave01.models.beverages.Beverage;
import opgave01.models.beverages.DarkRoast;
import opgave01.models.beverages.Espresso;
import opgave01.models.condiments.Mocha;
import opgave01.models.condiments.Whip;

public class Opgave01 {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
