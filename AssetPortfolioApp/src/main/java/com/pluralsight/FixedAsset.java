package com.pluralsight;

import com.sun.jdi.Value;

public abstract class FixedAsset implements Valuable {

    private String name;
    private double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public double getMarketValue() {
        return marketValue;

    }
}
