package com.brandonburrus.designpatterns.creational.prototype;

public class CharacterGraphic implements Graphic {

    private final char character;

    public CharacterGraphic(char character) {
        this.character = character;
    }

    @Override
    public String render() {
        return String.valueOf(character);
    }

    @Override
    public Graphic clone() {
        return new CharacterGraphic(character);
    }
}
