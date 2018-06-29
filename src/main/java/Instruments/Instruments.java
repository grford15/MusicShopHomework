package Instruments;

import Behaviours.ISell;

public abstract class Instruments implements ISell {

    private double wholesalePrice;
    private double retailPrice;
    private InstrumentType type;
    private String make;

    public Instruments(double wholesalePrice, double retailPrice, InstrumentType type, String make) {
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.type = type;
        this.make = make;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
