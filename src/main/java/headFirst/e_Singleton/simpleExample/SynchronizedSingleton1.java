package headFirst.e_Singleton.simpleExample;

public class SynchronizedSingleton1 {
    private static SynchronizedSingleton1 uniqueInstance;

    private SynchronizedSingleton1() {
    }

    public static synchronized SynchronizedSingleton1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton1();
        }

        return uniqueInstance;
    }
}
