package com.pluralsight;

import com.pluralsight.finance.*;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private String name;
    private String owner;
    private List<Valuable> assets;

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

    public List<Valuable> getAssets() {
        return assets;
    }

    public void setAssets(List<Valuable> assets) {
        this.assets = assets;
    }

    public void add(Valuable asset) {
        assets.add(asset);

    }

    double getValue() {
        double total = 0;
        for (Valuable asset : assets) {
            total += asset.getValue();
        }
        return total;
    }

    public String getMostValuable() {
        if (assets.isEmpty()) return "No Assets Available";

        Valuable max = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() > max.getValue()) {
                max = asset;
            }

        }
        return "Most Valuable Asset: " + max.getClass().getSimpleName() + " -> " + max.getValue();
    }

    private String  getAssetName(Valuable asset) {
        if (asset instanceof FixedAsset) {
            return ((FixedAsset) asset).getName();
        }else if (asset instanceof BankAccount) {
            return ((BankAccount) asset).getName();
        }else if (asset instanceof CreditCard) {
            return ((CreditCard) asset).getName();
        }
        return "Unknown Asset";
    }

    public Valuable getLeastValuable() {
        if (assets.isEmpty()) return null;

        Valuable min = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() < min.getValue()) {
                min = asset;
            }
        }
        return min;
    }
}
