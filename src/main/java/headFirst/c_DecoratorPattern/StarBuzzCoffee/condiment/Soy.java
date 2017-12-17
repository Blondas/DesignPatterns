package headFirst.c_DecoratorPattern.StarBuzzCoffee.condiment;

import headFirst.c_DecoratorPattern.StarBuzzCoffee.CoffeeSize;
import headFirst.c_DecoratorPattern.StarBuzzCoffee.beverage.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public CoffeeSize getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
