package headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.pizza;

import headFirst.d_FactoryPattern.abstractFactory.pizzaFactory.ingredients.*;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;
    protected ArrayList toppings = new ArrayList();

    abstract public void prepare();

    public void bake() {
        System.out.println("Baking..");
    }
    public void cut() {
        System.out.println("cutting");
    }
    public void box() {
        System.out.println("boxing pizza");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                ", toppings=" + toppings +
                '}';
    }
}
