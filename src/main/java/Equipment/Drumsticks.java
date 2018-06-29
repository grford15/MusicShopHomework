package Equipment;


public class Drumsticks extends Equipment {

    public Drumsticks(String itemName, double wholesalePrice, double retailPrice) {
        super(itemName, wholesalePrice, retailPrice);
    }

    public double calculateMarkUp() {
        return getRetailPrice() - getWholesalePrice();
    }
}
