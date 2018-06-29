package Instruments;

public abstract class Instruments {

    private double wholesalePrice;
    private double retailPrice;
    private InstrumentType type;
    private String make;
    private String model;

    public Instruments(double wholesalePrice, double retailPrice, InstrumentType type, String make, String model) {
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.type = type;
        this.make = make;
        this.model = model;
    }
}
