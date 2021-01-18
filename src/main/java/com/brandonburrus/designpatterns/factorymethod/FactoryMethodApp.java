package com.brandonburrus.designpatterns.factorymethod;

public class FactoryMethodApp {

    public static void main(String[] args) {
        App myApp = new MyApp();
        myApp.addDocument();
        myApp.addDocument();
        myApp.addDocument();
        myApp.getDocuments().forEach(doc -> System.out.println("Document in app: " + doc.getDoc()));
    }
}
