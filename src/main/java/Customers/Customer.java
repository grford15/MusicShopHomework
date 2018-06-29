package Customers;

import Behaviours.ISell;
import Instruments.Instruments;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<ISell> shoppingCart;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.shoppingCart = new ArrayList<ISell>();
    }


    public double getWallet() {
        return wallet;
    }

    public ArrayList<ISell> getShoppingCart() {
        return shoppingCart;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void buyInstrument(Instruments instrument) {
        if(instrument.getRetailPrice() < wallet){
            shoppingCart.add(instrument);
            setWallet(wallet - instrument.getRetailPrice());
        }
    }
}
