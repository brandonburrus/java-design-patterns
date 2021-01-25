package com.brandonburrus.designpatterns.structural.composite;

public class RedComponent extends Component implements Colorable {

    RedComponent(Component... children) {
        super(children);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public String getColorName() {
        return "Red";
    }

}
