package headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizzaStore;

import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.ingredients.ingedientFactory.ChicagoPizzaIngredientFactory;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.ingredients.ingedientFactory.PizzaIngredientFactory;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.ChicagoPizza.ChicagoCheesePizza;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.ChicagoPizza.ChicagoClamPizza;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.ChicagoPizza.ChicagoPepperoniPizza;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.ChicagoPizza.ChicagoVeggiePizza;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            pizza = new ChicagoCheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ChicagoCheesePizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new ChicagoCheesePizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if (item.equals("veggie")) {
            pizza = new ChicagoCheesePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        return pizza;
    }
}
