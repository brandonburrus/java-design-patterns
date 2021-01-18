package com.brandonburrus.designpatterns.creational.singleton;

/**
 * The type Singleton app.
 */
public class SingletonApp {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        MySingleton.getInstance().doSomething();
    }
}
