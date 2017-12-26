package headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizzaStore;

import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.ingredients.ingedientFactory.NYPizzaIngredientFactory;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.ingredients.ingedientFactory.PizzaIngredientFactory;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.NYPizza.NYCheesePizza;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.NYPizza.NYClamPizza;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.NYPizza.NYPepperoniPizza;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.NYPizza.NYVeggiePizza;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            pizza = new NYCheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new NYCheesePizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new NYCheesePizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if (item.equals("veggie")) {
            pizza = new NYCheesePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        return pizza;
    }
}
