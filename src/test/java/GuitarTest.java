import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(25.00, 35.00, InstrumentType.GUITAR, "Rickenbacker", "Solid Body");
    }

    @Test
    public void canPlay() {
        assertEquals("Anyway, here's wonderwall", guitar.play());
    }
}
