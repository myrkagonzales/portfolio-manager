package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

// portfolio must hold different types of objects
// they all implement Valuable, so they can be stored in the same collection

public class Portfolio {

    // information
    private String name;
    private String owner;

    // Stores all assets that implement Valuable
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    // add an  asset to the portfolio
    public void add(Valuable asset) {
        assets.add(asset);
    }

    // calculate the netvalue of all valuables in the portfolio
    public double getValue() {

        // starting at zero
        double total = 0.0;

        // going through every valuable in the portfolio
        for (Valuable asset : assets) {
            //add value to the total
            total += asset.getValue();
        }
        // return the final net value
        return total;
    }

    // locates and returns the asset with highest value
    public Valuable getMostValuable() {
        // empty portfolio
        if (assets.isEmpty()) {
            return null;
        }
        // assume the first asset has the highest value
        Valuable mostValuable = assets.get(0);

        // compare the remaining assets
        for (Valuable asset : assets) {
            // checking whether asset is worth more
            if (asset.getValue() > mostValuable.getValue()) {
                mostValuable = asset;
            }
        }
        // return the asset with the highest value
        return mostValuable;
    }

    // Least Valuable //
    public Valuable getLeastValuable() {

        // starting an empty portfolio
        if (assets.isEmpty()) {
            return null;

        }
        // assume first asset had the lowest value
        Valuable leastValuable = assets.get(0);

        // compare all assets in the portfolio
        for (Valuable asset : assets) {

            // checking whether this asset has a lower value
            if (asset.getValue() < leastValuable.getValue()) leastValuable = asset;
        }
        // return the asset with the lowest value
        return leastValuable;
    }
}



