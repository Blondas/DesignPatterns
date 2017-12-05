package headFirst.a_introToDesignPatterns.quackBehaviour;

public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println(" == SILENCE ==");
    }
}
