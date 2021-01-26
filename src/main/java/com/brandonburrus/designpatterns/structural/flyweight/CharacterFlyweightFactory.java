package com.brandonburrus.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFlyweightFactory {

    private static final CharacterFlyweightFactory instance;
    private static final Map<Character, CharacterFlyweight> charMap;

    static {
        instance = new CharacterFlyweightFactory();
        charMap = new HashMap<>();
    }

    private CharacterFlyweightFactory() {}

    public static CharacterFlyweightFactory getInstance() {
        return instance;
    }

    public CharacterFlyweight getCharacter(char character) {
        if (CharacterFlyweightFactory.charMap.containsKey(character)) {
            return CharacterFlyweightFactory.charMap.get(character);
        }

        CharacterFlyweight flyweight = new CharacterFlyweight(character);
        CharacterFlyweightFactory.charMap.put(character, flyweight);

        return flyweight;
    }
}
