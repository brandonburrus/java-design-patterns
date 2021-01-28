package com.brandonburrus.designpatterns.behavioral.observer;

public class ObserverApp {

    public static void main(String[] args) {
        Subject<String> subject = new Subject<>();
        Subscription<String> subscription = subject.subscribe(System.out::println);
        subject.next("Hello");
        subject.next("World");
        subscription.unsubscribe();
        subject.next("Last value");
    }
}
