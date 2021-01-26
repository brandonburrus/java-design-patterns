package com.brandonburrus.designpatterns.structural.proxy;

public class ProxyApp {

    public static void main(String[] args) {
        ElementDocument elementDocument = new ElementDocument();

        elementDocument.addElement(new ElementImpl());
        elementDocument.addElement(new ElementImpl());
        elementDocument.addElement(new ElementImpl());
        elementDocument.addElement(new ExpensiveElementProxy());
        elementDocument.addElement(new ElementImpl());

        elementDocument.listElements();
    }
}
