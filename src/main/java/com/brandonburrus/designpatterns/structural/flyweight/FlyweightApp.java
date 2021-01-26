package com.brandonburrus.designpatterns.structural.flyweight;

public class FlyweightApp {

    public static void main(String[] args) {
        String str = "ABBA";
        for (char character : str.toCharArray()) {
            DrawableCharacter drawable = CharacterFlyweightFactory.getInstance().getCharacter(character);
            drawable.draw().forEach(System.out::println);
            System.out.println();
        }

    }
}
