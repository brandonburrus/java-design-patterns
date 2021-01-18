package com.brandonburrus.designpatterns.creational.builder.simple;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.Objects;

/**
 * The type Simple pojo.
 */
public class SimplePojo {

    private int valueA;
    private int valueB;
    private String valueC;
    private boolean valueD;

    /**
     * Instantiates a new Simple pojo.
     *
     * @param valueA the value a
     * @param valueB the value b
     * @param valueC the value c
     * @param valueD the value d
     */
    public SimplePojo(int valueA, int valueB, String valueC, boolean valueD) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.valueC = valueC;
        this.valueD = valueD;
    }

    /**
     * Instantiates a new Simple pojo.
     */
    public SimplePojo() {
        this(0, 0, "", false);
    }

    /**
     * Gets value a.
     *
     * @return the value a
     */
    public int getValueA() {
        return valueA;
    }

    /**
     * Sets value a.
     *
     * @param valueA the value a
     */
    public void setValueA(int valueA) {
        this.valueA = valueA;
    }

    /**
     * Gets value b.
     *
     * @return the value b
     */
    public int getValueB() {
        return valueB;
    }

    /**
     * Sets value b.
     *
     * @param valueB the value b
     */
    public void setValueB(int valueB) {
        this.valueB = valueB;
    }

    /**
     * Gets value c.
     *
     * @return the value c
     */
    public String getValueC() {
        return valueC;
    }

    /**
     * Sets value c.
     *
     * @param valueC the value c
     */
    public void setValueC(String valueC) {
        this.valueC = valueC;
    }

    /**
     * Is value d boolean.
     *
     * @return the boolean
     */
    public boolean isValueD() {
        return valueD;
    }

    /**
     * Sets value d.
     *
     * @param valueD the value d
     */
    public void setValueD(boolean valueD) {
        this.valueD = valueD;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        SimplePojo that = (SimplePojo) other;
        return valueA == that.valueA && valueB == that.valueB && valueD == that.valueD && Objects.equals(valueC, that.valueC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueA, valueB, valueC, valueD);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
            .add("valueA", this.valueA)
            .add("valueB", this.valueB)
            .add("valueC", this.valueC)
            .add("valueD", this.valueD)
            .toString();
    }
}
