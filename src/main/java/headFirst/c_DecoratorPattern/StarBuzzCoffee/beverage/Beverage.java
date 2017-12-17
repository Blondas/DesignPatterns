package headFirst.c_DecoratorPattern.StarBuzzCoffee.beverage;

import headFirst.c_DecoratorPattern.StarBuzzCoffee.CoffeeSize;

public abstract class Beverage {
    String description = "Unknown Beverage";
    CoffeeSize size;

    public String getDescription() {
        return description;
    }

    public CoffeeSize getSize() {
        return size;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
