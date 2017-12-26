package headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.ChicagoPizza;

import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.ingredients.ingedientFactory.PizzaIngredientFactory;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.Pizza;

public class ChicagoClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
