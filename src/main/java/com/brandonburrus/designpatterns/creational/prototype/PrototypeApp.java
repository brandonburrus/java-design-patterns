package com.brandonburrus.designpatterns.creational.prototype;

public class PrototypeApp {

    public static void main(String[] args) {
        Graphic a = new CharacterGraphic('a');
        Graphic one = new NumberGraphic(1);
        Tool characterTool = new GraphicTool(a);
        Tool numberTool = new GraphicTool(one);
        Tool duplicateTool = new GraphicTool(one);

        characterTool.manipulate();
        numberTool.manipulate();
        duplicateTool.manipulate();
    }
}
