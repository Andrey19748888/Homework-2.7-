package drivers;

import transport.Bus;

public class CDriver extends Driver<Bus> {
    public CDriver(String fio, String license, int exp, Bus bus) {
        super(fio, license, exp, bus);
    }
}
