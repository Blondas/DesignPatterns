package headFirst.c_DecoratorPattern.StarBuzzCoffee.condiment;

import headFirst.c_DecoratorPattern.StarBuzzCoffee.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

    protected double getCondimentCost() {
       return getSize().cost();
    }
}
