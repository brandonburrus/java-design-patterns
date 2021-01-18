package com.brandonburrus.designpatterns.creational.prototype;

/**
 * The type Graphic tool.
 */
public class GraphicTool implements Tool {

    private Graphic graphic;

    /**
     * Instantiates a new Graphic tool.
     *
     * @param prototypeGraphic the prototype graphic
     */
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
