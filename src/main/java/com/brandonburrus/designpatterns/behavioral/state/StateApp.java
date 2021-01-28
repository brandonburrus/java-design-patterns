package com.brandonburrus.designpatterns.behavioral.state;

public class StateApp {

    public static void main(String[] args) {
        Connection connection = new Connection();

        try {
            connection.open();
            connection.ping();
            connection.open();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
