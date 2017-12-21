package headFirst.d_FactoryPattern.pizzaFactory;

import headFirst.d_FactoryPattern.pizzaFactory.pizza.Pizza;
import headFirst.d_FactoryPattern.pizzaFactory.pizzaStore.ChicagoPizzaStore;
import headFirst.d_FactoryPattern.pizzaFactory.pizzaStore.NYPizzaStore;
import headFirst.d_FactoryPattern.pizzaFactory.pizzaStore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("ethan ordered a " + pizza.getName());

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("joel ordered a " + pizza.getName());
    }
}
