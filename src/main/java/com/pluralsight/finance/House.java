package com.pluralsight.finance;

public class House extends FixedAsset {

    // properties of house
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    //initialize the house and its inherited asset

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    // return the house's market value
    @Override
    public double getValue() {
        return super.getValue();
    }
}
