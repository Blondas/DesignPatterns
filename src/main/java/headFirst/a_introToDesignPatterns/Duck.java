package headFirst.a_introToDesignPatterns;

import headFirst.a_introToDesignPatterns.flyBehaviour.FlyBehaviour;
import headFirst.a_introToDesignPatterns.quackBehaviour.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void swim() {
        System.out.println("I am swimming");
    }
    public abstract void display();
}
