package headFirst.c_DecoratorPattern.StarBuzzCoffee.beverage;

import headFirst.c_DecoratorPattern.StarBuzzCoffee.CoffeeSize;

public class HouseBlend extends Beverage {
    public HouseBlend(CoffeeSize size) {
        description = "House Blend";
        this.size = size;
    }

    @Override
    public double cost() {
        return .89;
    }
}
