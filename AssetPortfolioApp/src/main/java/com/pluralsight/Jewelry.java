package com.pluralsight;

public class Jewelry implements Valuable {

    private double karat;

    public Jewelry(double karat) {
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return karat;
    }
}
