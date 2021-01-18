package com.brandonburrus.designpatterns.creational.prototype;

/**
 * The type Character graphic.
 */
public class CharacterGraphic implements Graphic {

    private final char character;

    /**
     * Instantiates a new Character graphic.
     *
     * @param character the character
     */
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
