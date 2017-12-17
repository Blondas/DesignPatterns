package headFirst.c_DecoratorPattern.StarBuzzCoffee.condiment;

import headFirst.c_DecoratorPattern.StarBuzzCoffee.beverage.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + getCondimentCost();
    }
}
