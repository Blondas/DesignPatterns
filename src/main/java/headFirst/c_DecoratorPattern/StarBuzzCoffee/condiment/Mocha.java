package headFirst.c_DecoratorPattern.StarBuzzCoffee.condiment;

import headFirst.c_DecoratorPattern.StarBuzzCoffee.CoffeeSize;
import headFirst.c_DecoratorPattern.StarBuzzCoffee.beverage.Beverage;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public CoffeeSize getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return beverage.cost() + getCondimentCost(); // todo: jak ten dekorator powinien wygladac???
    }
}
