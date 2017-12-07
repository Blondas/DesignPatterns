package headFirst.a_introToDesignPatterns;

import headFirst.a_introToDesignPatterns.flyBehaviour.FlyNoWay;
import headFirst.a_introToDesignPatterns.quackBehaviour.Quack;

public class ModelDuck  extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I am a model duck");
    }
}
