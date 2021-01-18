package com.brandonburrus.designpatterns.creational.builder;

/**
 * The type Converter builder.
 */
public class ConverterBuilder {
    private int configuration;
    private boolean toggle;

    /**
     * Instantiates a new Converter builder.
     */
    public ConverterBuilder() {
        configuration = 0;
        toggle = false;
    }

    /**
     * Configuration converter builder.
     *
     * @param configurationValue the configuration value
     *
     * @return the converter builder
     */
    public ConverterBuilder configuration(int configurationValue) {
        this.configuration = configurationValue;
        return this;
    }

    /**
     * Toggle converter builder.
     *
     * @param toggleValue the toggle value
     *
     * @return the converter builder
     */
    public ConverterBuilder toggle(boolean toggleValue) {
        this.toggle = toggleValue;
        return this;
    }

    /**
     * Build converter.
     *
     * @return the converter
     */
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
