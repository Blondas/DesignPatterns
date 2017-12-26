package headFirst.e_Singleton.simpleExample;

public class EagerSingleton {
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }
}
