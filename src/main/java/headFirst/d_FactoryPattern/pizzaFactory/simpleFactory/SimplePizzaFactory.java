package headFirst.d_FactoryPattern.pizzaFactory.simpleFactory;

import headFirst.d_FactoryPattern.pizzaFactory.pizza.*;
import headFirst.d_FactoryPattern.pizzaFactory.pizza.NYPizza.NYCheesePizza;
import headFirst.d_FactoryPattern.pizzaFactory.pizza.NYPizza.NYClamPizza;
import headFirst.d_FactoryPattern.pizzaFactory.pizza.NYPizza.NYPepperoniPizza;
import headFirst.d_FactoryPattern.pizzaFactory.pizza.NYPizza.NYVeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYVeggiePizza();
        }

        return pizza;
    }
}
