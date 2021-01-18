package com.brandonburrus.designpatterns.factorymethod.staticmethod;

public class Text {

    private final String text;

    private Text(String text) {
        this.text = text;
    }

    public static Text of(String content) {
        return new Text(content);
    }

    public static Text fromInt(int i) {
        return new Text(String.valueOf(i));
    }

    @Override
    public String toString() {
        return text;
    }
}
