package com.brandonburrus.designpatterns.structural.composite;

public class BlueComponent extends Component implements Colorable {
    BlueComponent(Component... children) {
        super(children);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public String getColorName() {
        return "Blue";
    }
}
