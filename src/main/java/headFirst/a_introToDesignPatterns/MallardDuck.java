package headFirst.a_introToDesignPatterns;

import headFirst.a_introToDesignPatterns.flyBehaviour.FlyWithWings;
import headFirst.a_introToDesignPatterns.quackBehaviour.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a MallardDuck");
    }
}
