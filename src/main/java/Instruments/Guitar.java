package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import Customers.Customer;

public class Guitar extends Instruments implements IPlay, ISell {
    public Guitar(double wholesalePrice, double retailPrice, InstrumentType type, String make) {
        super(wholesalePrice, retailPrice, type, make);
    }

    public String play(){
        return "Anyway, here's wonderwall";
    }


}
