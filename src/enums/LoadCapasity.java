package enums;

public enum LoadCapasity {

    N1(null,3.5f),
    N2(3.5f,12f),
    N3(null,12f);

    private final Float lowerLoadCapacity;
    private final Float loadCapacityUpper;

    LoadCapasity(Float lowerLoadCapacity, Float loadCapacityUpper) {
        this.lowerLoadCapacity = lowerLoadCapacity;
        this.loadCapacityUpper = loadCapacityUpper;
    }

    public Float getLowerLoadCapacity() {
        return lowerLoadCapacity;
    }

    public Float getLoadCapacityUpper() {
        return loadCapacityUpper;
    }

    @Override
    public String toString() {
        if (lowerLoadCapacity == null) {
            return "поднимает до " + loadCapacityUpper + " тонн";
        }
        return "поднимает от " + lowerLoadCapacity + " тонн до " + loadCapacityUpper + " тонн";
    }
}
