package com.pluralsight.finance;

public class Jewelry extends FixedAsset {

    // store karat of jewelry
    private double karat;

// initalize the jewelry's name, market value, and karat
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    // returns the market value stored in parents class
    @Override
    public double getValue() {
        return super.getValue();
    }
}
