package Equipment;

import Behaviours.ISell;

public abstract class Equipment implements ISell {

    private String itemName;
    private double wholesalePrice;
    private double retailPrice;

    public Equipment(String itemName, double wholesalePrice, double retailPrice) {
        this.itemName = itemName;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
