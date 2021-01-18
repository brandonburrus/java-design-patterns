package com.brandonburrus.designpatterns.prototype;

public class GraphicTool implements Tool {

    private Graphic graphic;

    public GraphicTool(final Graphic prototypeGraphic) {
        super();
        this.graphic = prototypeGraphic.clone();
    }

    @Override
    public void manipulate() {
        System.out.println("Rendering graphic...");
        System.out.println(System.identityHashCode(graphic));
        System.out.println(graphic.render());
    }
}
