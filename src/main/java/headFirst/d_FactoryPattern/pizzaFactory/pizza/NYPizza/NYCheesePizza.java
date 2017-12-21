package headFirst.d_FactoryPattern.pizzaFactory.pizza.NYPizza;

import headFirst.d_FactoryPattern.pizzaFactory.pizza.Pizza;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        name = "ny style cheese and sauce pizza";
        dough = "thin crust dough";
        sauce = "marinara sauce";

        toppings.add("grated reggiano cheese");
    }
}
