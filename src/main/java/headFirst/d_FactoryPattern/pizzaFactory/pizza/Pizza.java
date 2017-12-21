package headFirst.d_FactoryPattern.pizzaFactory.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

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
}
