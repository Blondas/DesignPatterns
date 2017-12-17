package headFirst.c_DecoratorPattern.StarBuzzCoffee.beverage;

import headFirst.c_DecoratorPattern.StarBuzzCoffee.CoffeeSize;

public class Espresso extends Beverage {
    public Espresso(CoffeeSize size) {
        description = "Espresso";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
