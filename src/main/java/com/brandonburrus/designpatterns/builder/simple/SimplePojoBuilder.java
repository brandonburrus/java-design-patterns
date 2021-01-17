package com.brandonburrus.designpatterns.builder.simple;

public final class SimplePojoBuilder {
    private int valueA;
    private int valueB;
    private String valueC;
    private boolean valueD;

    private SimplePojoBuilder() {}

    public static SimplePojoBuilder simplePojo() {
        return new SimplePojoBuilder();
    }

    public SimplePojoBuilder valueA(int valueA) {
        this.valueA = valueA;
        return this;
    }

    public SimplePojoBuilder valueB(int valueB) {
        this.valueB = valueB;
        return this;
    }

    public SimplePojoBuilder valueC(String valueC) {
        this.valueC = valueC;
        return this;
    }

    public SimplePojoBuilder valueD(boolean valueD) {
        this.valueD = valueD;
        return this;
    }

    public SimplePojo build() {
        SimplePojo simplePojo = new SimplePojo();
        simplePojo.setValueA(valueA);
        simplePojo.setValueB(valueB);
        simplePojo.setValueC(valueC);
        simplePojo.setValueD(valueD);
        return simplePojo;
    }
}
