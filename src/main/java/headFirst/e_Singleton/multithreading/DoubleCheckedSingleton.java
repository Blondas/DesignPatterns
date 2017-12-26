package headFirst.e_Singleton.multithreading;

import headFirst.e_Singleton.simpleExample.Singleton;

public class DoubleCheckedSingleton {
    private volatile static DoubleCheckedSingleton uniqueInstance;

    private DoubleCheckedSingleton() {
    }

    public static synchronized DoubleCheckedSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedSingleton();
                }
            }
        }

        return uniqueInstance;
    }
}
