package finance;

public abstract class FixedAsset implements Valuable {

    // information for all fixed assets
    private String name;
    private double marketValue;

    //constructor initializes the assets name and value


    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    //returns the current value of fixed asset
    @Override
    public double getValue() {
        return marketValue;
    }

    // returns the asset name
    public String getName() {
        return name;
    }
}
