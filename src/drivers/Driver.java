package drivers;

import transport.Competing;
import transport.Transport;

public class Driver<T extends Transport & Competing> {
    private final String fio;

    private final String license;
    private final int exp;
    private final T car;


    public Driver(String fio, String license, int exp, T car) {
        this.fio = fio;
        this.license = license;
        this.exp = exp;
        this.car = car;
        car.setDriver(this);
    }

    public void move() {
        System.out.println("Driver moving");
    }

    public void drive() {
        System.out.println("Driver driving " + car.getBrand());
    }
    @Override
    public String toString() {
        return "Имя водителя " + fio;

    }


    public String getLicense() {
        return license;
    }

    public String getFio() {
        return fio;}


}
