package com.brandonburrus.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    private final List<Component> children;

    Component(Component... children) {
        this.children = new ArrayList<>();

        for (Component child: children) {
            this.addChild(child);
        }
    }

    public List<Component> getChildren() {
        return children;
    }

    public int addChild(Component child) {
        this.children.add(child);
        return this.children.size() - 1;
    }

    public boolean removeChildAtIndex(int index) {
        if (this.children.size() >= index) {
            this.children.remove(index);
            return true;
        }
        return false;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Component {" +
            "children: " + children +
            "}";
    }
}
