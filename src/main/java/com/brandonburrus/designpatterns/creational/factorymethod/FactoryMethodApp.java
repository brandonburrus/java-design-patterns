package com.brandonburrus.designpatterns.creational.factorymethod;

/**
 * The type Factory method app.
 */
public class FactoryMethodApp {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        App myApp = new MyApp();
        myApp.addDocument();
        myApp.addDocument();
        myApp.addDocument();
        myApp.getDocuments().forEach(doc -> System.out.println("Document in app: " + doc.getDoc()));
    }
}
