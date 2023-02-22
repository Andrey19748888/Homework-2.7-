package drivers;

import transport.Car;

public class BDriver extends Driver <Car> {

    public BDriver(String fio, String license, int exp, Car car) {

        super(fio, license, exp, car);
    }

    public void move() {
        System.out.println("B driver moving");
    }



}
