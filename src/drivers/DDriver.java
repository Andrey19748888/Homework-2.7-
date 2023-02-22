package drivers;

import transport.Truck;

public class DDriver extends Driver<Truck> {
    public DDriver(String fio, String license, int exp, Truck truck) {
        super(fio, license, exp, truck);
    }
}
