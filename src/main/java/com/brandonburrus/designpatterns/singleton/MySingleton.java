package com.brandonburrus.designpatterns.singleton;

public class MySingleton {

    private static final MySingleton instance;

    static {
        instance = new MySingleton();
    }

    private MySingleton() {}

    public static MySingleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("Only ever one instance of my singleton!");
    }
}
