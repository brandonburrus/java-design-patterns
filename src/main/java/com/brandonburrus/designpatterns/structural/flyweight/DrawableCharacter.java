package com.brandonburrus.designpatterns.structural.flyweight;

import java.util.List;

public interface DrawableCharacter {

    List<String> draw();
    char getChar();
}
