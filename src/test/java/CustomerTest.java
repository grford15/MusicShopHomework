import Customers.Customer;
import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Emanuel", 500.00);
        guitar = new Guitar(25.00, 35.00, InstrumentType.GUITAR, "Rickenbacker");
    }

    @Test
    public void hasNothinginCart() {
        assertEquals(0, customer.getShoppingCart().size());
    }

    @Test
    public void canBuy() {
        customer.buyInstrument(guitar);
        assertEquals(1, customer.getShoppingCart().size());
        assertEquals(true, customer.getShoppingCart().contains(guitar));
        assertEquals(465.00, customer.getWallet(), 0.1);
    }
}
