package com.brandonburrus.designpatterns.creational.builder.simple;

/**
 * The type Simple pojo builder.
 */
public final class SimplePojoBuilder {
    private int valueA;
    private int valueB;
    private String valueC;
    private boolean valueD;

    private SimplePojoBuilder() {}

    /**
     * Simple pojo simple pojo builder.
     *
     * @return the simple pojo builder
     */
    public static SimplePojoBuilder simplePojo() {
        return new SimplePojoBuilder();
    }

    /**
     * Value a simple pojo builder.
     *
     * @param valueA the value a
     *
     * @return the simple pojo builder
     */
    public SimplePojoBuilder valueA(int valueA) {
        this.valueA = valueA;
        return this;
    }

    /**
     * Value b simple pojo builder.
     *
     * @param valueB the value b
     *
     * @return the simple pojo builder
     */
    public SimplePojoBuilder valueB(int valueB) {
        this.valueB = valueB;
        return this;
    }

    /**
     * Value c simple pojo builder.
     *
     * @param valueC the value c
     *
     * @return the simple pojo builder
     */
    public SimplePojoBuilder valueC(String valueC) {
        this.valueC = valueC;
        return this;
    }

    /**
     * Value d simple pojo builder.
     *
     * @param valueD the value d
     *
     * @return the simple pojo builder
     */
    public SimplePojoBuilder valueD(boolean valueD) {
        this.valueD = valueD;
        return this;
    }

    /**
     * Build simple pojo.
     *
     * @return the simple pojo
     */
    public SimplePojo build() {
        SimplePojo simplePojo = new SimplePojo();
        simplePojo.setValueA(valueA);
        simplePojo.setValueB(valueB);
        simplePojo.setValueC(valueC);
        simplePojo.setValueD(valueD);
        return simplePojo;
    }
}
