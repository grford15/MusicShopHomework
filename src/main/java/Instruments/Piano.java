package Instruments;

import Behaviours.IPlay;

public class Piano extends Instruments implements IPlay {
    public Piano(double wholesalePrice, double retailPrice, InstrumentType type, String make) {
        super(wholesalePrice, retailPrice, type, make);
    }

    public String play(){
        return "PIIIAAAANNNOOOOOOO";
    }
}
