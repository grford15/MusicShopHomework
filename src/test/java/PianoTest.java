import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(800.00, 999.00, InstrumentType.KEYBOARD, "Roland");
    }

    @Test
    public void canPlay(){
        assertEquals("PIIIAAAANNNOOOOOOO", piano.play());
    }
}
