package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<Valuable> getAssets() {
        return assets;
    }

    public void setAssets(ArrayList<Valuable> assets) {
        this.assets = assets;
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double total = 0;
        for (Valuable asset: assets) {
            total += asset.getValue();
        }
        return total;
    }
}
