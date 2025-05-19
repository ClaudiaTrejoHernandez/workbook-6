package com.pluralsight;

public class Jewelry extends FixedAsset {

    private double karat;

    public Jewelry(String name, Double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return karat;
    }
}
