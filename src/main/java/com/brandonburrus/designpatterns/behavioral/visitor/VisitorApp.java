package com.brandonburrus.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorApp {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Jeremy"));
        animals.add(new Dog("Steve"));
        animals.add(new Animal() {
            @Override
            public int getNumberOfLegs() {
                return 2;
            }

            @Override
            public String getName() {
                return "Blzork";
            }
        });

        AnimalVisitor visitor = new AnimalVisitor();
        for (Animal animal : animals) {
            visitor.visit(animal);
        }
    }
}
