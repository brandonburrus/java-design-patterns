package com.brandonburrus.designpatterns.creational.factorymethod.staticmethod;

/**
 * The type Text.
 */
public class Text {

    private final String text;

    private Text(String text) {
        this.text = text;
    }

    /**
     * Of text.
     *
     * @param content the content
     *
     * @return the text
     */
    public static Text of(String content) {
        return new Text(content);
    }

    /**
     * From int text.
     *
     * @param i the
     *
     * @return the text
     */
    public static Text fromInt(int i) {
        return new Text(String.valueOf(i));
    }

    @Override
    public String toString() {
        return text;
    }
}
