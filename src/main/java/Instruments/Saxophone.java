package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import Customers.Customer;

public class Saxophone extends Instruments implements IPlay, ISell {
    public Saxophone(double wholesalePrice, double retailPrice, InstrumentType type, String make) {
        super(wholesalePrice, retailPrice, type, make);
    }

    public String play() {
        return "Saxamaphone Saxamaphone Saxamaphone";
    }

    public double calculateMarkUp() {
        return getRetailPrice() - getWholesalePrice();
    }
}
