package com.brandonburrus.designpatterns.creational.builder.simple;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.Objects;

public class SimplePojo {

    private int valueA;
    private int valueB;
    private String valueC;
    private boolean valueD;

    public SimplePojo(int valueA, int valueB, String valueC, boolean valueD) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.valueC = valueC;
        this.valueD = valueD;
    }

    public SimplePojo() {
        this(0, 0, "", false);
    }

    public int getValueA() {
        return valueA;
    }

    public void setValueA(int valueA) {
        this.valueA = valueA;
    }

    public int getValueB() {
        return valueB;
    }

    public void setValueB(int valueB) {
        this.valueB = valueB;
    }

    public String getValueC() {
        return valueC;
    }

    public void setValueC(String valueC) {
        this.valueC = valueC;
    }

    public boolean isValueD() {
        return valueD;
    }

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
