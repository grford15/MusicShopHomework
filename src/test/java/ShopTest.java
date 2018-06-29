import Customers.Customer;
import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Saxophone;
import Shop.Shop;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Guitar guitar;
    Customer customer;
    Shop shop;
    Piano piano;
    Saxophone saxophone;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(25.00, 35.00, InstrumentType.GUITAR, "Rickenbacker");
        customer = new Customer("Emanuel", 500.00);
        shop = new Shop("Instruments-R-Us");
        piano = new Piano(800.00, 999.00, InstrumentType.KEYBOARD, "Roland");
        saxophone = new Saxophone(99.00, 150.00, InstrumentType.WOODWIND, "Yamaha");
    }

    @Test
    public void canSellToCustomer() {
        shop.sellInstrument(customer, guitar);
        assertEquals(0, shop.stockCount());
        assertEquals(465.00, customer.getWallet(), 0.1);
        assertEquals(true, customer.getShoppingCart().contains(guitar));
    }

    @Test
    public void canAddToStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.stockCount());
        assertEquals(true, shop.getStock().contains(guitar));
    }

    @Test
    public void canBinStock(){
        shop.addStock(guitar);
        shop.binItem(guitar);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canEmptyShop(){
        shop.addStock(guitar);
        shop.burnTheShop();
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void possibleShopProfit(){
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(saxophone);
        assertEquals(260, shop.);
    }
}
