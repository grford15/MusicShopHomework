package Equipment;

public class GuitarCase extends Equipment {

    public GuitarCase(String itemName, double wholesalePrice, double retailPrice) {
        super(itemName, wholesalePrice, retailPrice);
    }

    public double calculateMarkUp() {
        return getRetailPrice() - getWholesalePrice();
    }
}
