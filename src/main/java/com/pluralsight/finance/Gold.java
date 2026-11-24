package com.pluralsight.finance;

public class Gold extends FixedAsset {

    // stores the weight of the gold
    private double weight;

    // initalizes the name, market value, and weight

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    // returns the market value inherited from fixedasset
    @Override
    public double getValue() {
        return getMarketValue();
    }
}
