package Instruments;

import Behaviours.IPlay;

public class Guitar extends Instruments implements IPlay {
    public Guitar(double wholesalePrice, double retailPrice, InstrumentType type, String make, String model) {
        super(wholesalePrice, retailPrice, type, make, model);
    }

    public String play(){
        return "Anyway, here's wonderwall";
    }
}
