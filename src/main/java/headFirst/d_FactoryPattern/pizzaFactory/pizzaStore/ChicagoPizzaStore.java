package headFirst.d_FactoryPattern.pizzaFactory.pizzaStore;

import headFirst.d_FactoryPattern.pizzaFactory.pizza.ChicagoPizza.ChicagoCheesePizza;
import headFirst.d_FactoryPattern.pizzaFactory.pizza.ChicagoPizza.ChicagoClamPizza;
import headFirst.d_FactoryPattern.pizzaFactory.pizza.ChicagoPizza.ChicagoPepperoniPizza;
import headFirst.d_FactoryPattern.pizzaFactory.pizza.ChicagoPizza.ChicagoVeggiePizza;
import headFirst.d_FactoryPattern.pizzaFactory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoCheesePizza();
        } else if (item.equals("clam")) {
            return new ChicagoClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoPepperoniPizza();
        } else if (item.equals("veggie")) {
            return new ChicagoVeggiePizza();
        } else return null;
    }
}
