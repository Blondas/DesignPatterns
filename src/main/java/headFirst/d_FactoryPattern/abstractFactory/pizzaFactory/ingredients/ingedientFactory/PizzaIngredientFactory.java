package headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.ingredients.ingedientFactory;

import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.ingredients.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
