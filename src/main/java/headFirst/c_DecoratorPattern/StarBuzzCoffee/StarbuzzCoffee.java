package headFirst.c_DecoratorPattern.StarBuzzCoffee;

import headFirst.c_DecoratorPattern.StarBuzzCoffee.CoffeeSize;
import headFirst.c_DecoratorPattern.StarBuzzCoffee.beverage.Beverage;
import headFirst.c_DecoratorPattern.StarBuzzCoffee.beverage.Espresso;
import headFirst.c_DecoratorPattern.StarBuzzCoffee.condiment.Mocha;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(CoffeeSize.VENTI);
        System.out.println(beverage.getDescription()
        + " $" + beverage.cost());

        Beverage beverage2 = new Espresso(CoffeeSize.GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);

        System.out.println(beverage2.getDescription()
        + " $" + beverage2.cost());
    }
}
