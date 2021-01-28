package com.brandonburrus.designpatterns.behavioral.templatemethod;

public abstract class DancingPerson implements Person {

    void doTheHockeyPockey() {
        rightHandIn();
        rightHandOut();
        leftHandIn();
        leftHandOut();
    }
}
