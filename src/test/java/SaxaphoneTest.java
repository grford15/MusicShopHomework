import Instruments.InstrumentType;
import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() throws Exception {
        saxophone = new Saxophone(99.00, 150.00, InstrumentType.WOODWIND, "Yamaha");
    }

    @Test
    public void canPlay(){
        assertEquals("Saxamaphone Saxamaphone Saxamaphone", saxophone.play());
    }
}
