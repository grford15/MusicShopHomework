package Instruments;

import Behaviours.IPlay;

public class Saxophone extends Instruments implements IPlay {
    public Saxophone(double wholesalePrice, double retailPrice, InstrumentType type, String make) {
        super(wholesalePrice, retailPrice, type, make);
    }

    public String play() {
        return "Saxamaphone Saxamaphone Saxamaphone";
    }
}
