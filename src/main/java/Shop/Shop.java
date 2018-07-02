package Shop;

import Behaviours.ISell;
import Customers.Customer;
import Equipment.Equipment;
import Equipment.GuitarCase;
import Instruments.Guitar;
import Instruments.Instruments;

import javax.sound.midi.Instrument;
import java.util.ArrayList;

public class Shop  {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public void sellInstrument(Customer customer, Instruments instrument){
        if(stock.contains(instrument) && customer.getWallet() > instrument.getRetailPrice()){
            customer.getShoppingCart().add(instrument);
            customer.setWallet(customer.getWallet() - instrument.getRetailPrice());
            stock.remove(instrument);
        }
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addStock(ISell stock){
        this.stock.add(stock);
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void binItem(ISell stock) {
        this.stock.remove(stock);
    }

    public void burnTheShop() {
        stock.clear();
    }


    public double possibleProfit() {
        int profit = 0;
        for(ISell instruments : stock){
            profit += instruments.calculateMarkUp();
        }
    return profit;}

    public void sellEquipment(Customer customer, Equipment stockItem) {
        if(stock.contains(stockItem) && customer.getWallet() > stockItem.getRetailPrice()){
            customer.getShoppingCart().add(stockItem);
            customer.setWallet(customer.getWallet() - stockItem.getRetailPrice());
            stock.remove(stockItem);
        }
    }
}
