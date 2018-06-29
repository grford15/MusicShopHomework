package Shop;

import Behaviours.ISell;
import Customers.Customer;
import Instruments.Guitar;
import Instruments.Instruments;

import java.util.ArrayList;

public class Shop  {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public void sellInstrument(Customer customer, Guitar guitar){
        if(customer.getWallet() > guitar.getRetailPrice()){
            customer.getShoppingCart().add(guitar);
            customer.setWallet(customer.getWallet() - guitar.getRetailPrice());
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
}
