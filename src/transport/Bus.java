package transport;

import drivers.Driver;
import enums.NumberOfSeats;
import exceptions.LicenseException;
import mechanic.Mechanic;

public class Bus extends Transport implements Competing{
    private NumberOfSeats numberOfSeats;


    public Bus(String brand, String model, double engineVolume, NumberOfSeats numberOfSeats) {
        super(brand, model, engineVolume, null);
        this.numberOfSeats = numberOfSeats;
    }

    public Bus(String brand, String model, double engineVolume, NumberOfSeats numberOfSeats, Mechanic mechanic) {
        super(brand, model, engineVolume, mechanic);
        this.numberOfSeats = numberOfSeats;
    }

    public String toString() {
        return  "бренд " + getBrand() + "\n"
                + "модель " + getModel() + "\n"
                + "объем двигателя " + getEngineVolume()
                + numberOfSeats;
    }
    @Override
    public boolean diag(Driver driver) throws LicenseException {
        System.out.println("Автобус не может проходить диагностику!");
        return false;
    }
}
