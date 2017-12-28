package headFirst.f_CommandPattern.receiver;

public class CeilingFan {
    String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("fan on in " + name);
    }

    public void off() {
        System.out.println("fan off in " + name);
    }
}
