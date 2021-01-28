package com.brandonburrus.designpatterns.behavioral.templatemethod;

public class TemplateMethodApp {

    public static void main(String[] args) {
        DancingPerson person = new DancingPerson() {
            @Override
            public void rightHandIn() {
                System.out.println("You put your right hand in");
            }

            @Override
            public void leftHandIn() {
                System.out.println("You put your left hand in");
            }

            @Override
            public void rightHandOut() {
                System.out.println("You put your right hand out");
            }

            @Override
            public void leftHandOut() {
                System.out.println("You put your left hand out");
            }
        };

        person.doTheHockeyPockey();
    }
}
