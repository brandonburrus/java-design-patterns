package com.brandonburrus.designpatterns.builder;

public class ConverterBuilder {
    private int configuration;
    private boolean toggle;

    public ConverterBuilder() {
        configuration = 0;
        toggle = false;
    }

    public ConverterBuilder configuration(int configurationValue) {
        this.configuration = configurationValue;
        return this;
    }

    public ConverterBuilder toggle(boolean toggleValue) {
        this.toggle = toggleValue;
        return this;
    }

    public Converter build() {
        if (toggle) {
            return new ConverterImplA();
        }
        if (configuration > 0) {
            return new ConverterImplB();
        } else {
            return new ConverterImplC();
        }
    }
}
