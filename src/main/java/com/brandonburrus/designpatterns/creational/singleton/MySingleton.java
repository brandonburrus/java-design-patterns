package com.brandonburrus.designpatterns.creational.singleton;

/**
 * The type My singleton.
 */
public class MySingleton {

    private static final MySingleton instance;

    static {
        instance = new MySingleton();
    }

    private MySingleton() {}

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static MySingleton getInstance() {
        return instance;
    }

    /**
     * Do something.
     */
    public void doSomething() {
        System.out.println("Only ever one instance of my singleton!");
    }
}
