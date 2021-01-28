package com.brandonburrus.designpatterns.behavioral.visitor;

public class AnimalVisitor {

    void visit(Cat cat) {
        System.out.println("Nice kitty named " + cat.getName());
    }

    void visit(Dog dot) {
        System.out.println("Good doggo named " + dot.getName());
    }

    void visit(Animal animal) {
        if (animal instanceof Dog) {
            visit((Dog) animal);
        } else if (animal instanceof Cat) {
            visit((Cat) animal);
        } else {
            System.out.println("This animal has " + animal.getNumberOfLegs() + " legs.");
        }
    }
}
