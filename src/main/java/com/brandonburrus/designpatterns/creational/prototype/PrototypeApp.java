package com.brandonburrus.designpatterns.creational.prototype;

/**
 * The type Prototype app.
 */
public class PrototypeApp {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
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
