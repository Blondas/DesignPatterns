package headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.ChicagoPizza;

import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.ingredients.ingedientFactory.PizzaIngredientFactory;
import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza.Pizza;

public class ChicagoCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    @Override
    public void cut() {
        System.out.println("cutting into square slices");
    }
}
