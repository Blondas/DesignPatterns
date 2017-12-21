package headFirst.d_FactoryPattern.pizzaFactory.pizza.ChicagoPizza;

import headFirst.d_FactoryPattern.pizzaFactory.pizza.Pizza;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = "chicago style cheese and sauce pizza";
        dough = "extra thick dough";
        sauce = "plum tomato sauce";

        toppings.add("grated reggiano cheese");
    }

    @Override
    public void cut() {
        System.out.println("cutting into square slices");
    }
}
