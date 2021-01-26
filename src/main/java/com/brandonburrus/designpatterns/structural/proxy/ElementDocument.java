package com.brandonburrus.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ElementDocument {

    private final List<Element> elements;

    public ElementDocument(Element... elements) {
        System.out.println("Created element document");
        this.elements = new ArrayList<>();
        for (Element element : elements) {
            addElement(element);
        }
    }

    public List<Element> getElements() {
        return elements;
    }

    public void addElement(Element element) {
        this.elements.add(element);
    }

    public void listElements() {
        elements
            .stream()
            .map(Element::getName)
            .forEach(System.out::println);
    }
}
