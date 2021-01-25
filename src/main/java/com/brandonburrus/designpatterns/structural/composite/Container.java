package com.brandonburrus.designpatterns.structural.composite;

public class Container extends Component {
    Container(Component... children) {
        super(children);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
