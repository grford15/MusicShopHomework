package Instruments;

public enum InstrumentType {

    GUITAR("Guitar"),
    WOODWIND("Woodwind"),
    BRASS("Brass"),
    PERCUSSION("Percussion"),
    KEYBOARD("Keyboard");

    private final String name;

    InstrumentType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
