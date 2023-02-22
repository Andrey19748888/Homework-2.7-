package enums;

public enum NumberOfSeats {

    VERY_LITTLE(0,10),
    FEW(0,25),
    AVERAGE(40,50),
    LARGE(60,80),
    VERY_BIG(100,120);

    private final Integer capasityMin;
    private final Integer capasityMax;

    NumberOfSeats(int capasityMin, int capasityMax) {
        this.capasityMin = capasityMin;
        this.capasityMax = capasityMax;
    }

    public int getCapasityMin() {
        return capasityMin;
    }

    public int getCapasityMax() {
        return capasityMax;
    }

    public String toString() {
        if (capasityMin == 0) {
            return "\nвместимость до " + capasityMax;
        }
        return "\nВместимость: " + capasityMin + " - " + capasityMax + " мест";
    }
}
