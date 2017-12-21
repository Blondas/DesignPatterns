package headFirst.d_FactoryPattern.pizzaFactory.pizzaStore;

import headFirst.d_FactoryPattern.pizzaFactory.pizza.NYPizza.NYCheesePizza;
import headFirst.d_FactoryPattern.pizzaFactory.pizza.NYPizza.NYClamPizza;
import headFirst.d_FactoryPattern.pizzaFactory.pizza.NYPizza.NYPepperoniPizza;
import headFirst.d_FactoryPattern.pizzaFactory.pizza.NYPizza.NYVeggiePizza;
import headFirst.d_FactoryPattern.pizzaFactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYCheesePizza();
        } else if (item.equals("clam")) {
            return new NYClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYPepperoniPizza();
        } else if (item.equals("veggie")) {
            return new NYVeggiePizza();
        } else return null;
    }
}
