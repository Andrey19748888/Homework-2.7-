package transport;

import drivers.Driver;
import enums.LoadCapasity;
import exceptions.LicenseException;
import mechanic.Mechanic;

public class Truck extends Transport implements Competing{

    private LoadCapasity loadCapasity;
    public Truck(String brand, String model, double engineVolume, LoadCapasity loadCapasity) {
        super(brand, model, engineVolume, null);
        this.loadCapasity = loadCapasity;
    }

    public Truck(String brand, String model, double engineVolume, LoadCapasity loadCapasity, Mechanic mechanic) {
        super(brand, model, engineVolume, mechanic);
        this.loadCapasity = loadCapasity;
    }

    public String toString() {
        return  "бренд " + getBrand()
                + "\nмодель " + getModel()
                + "\nобъем двигателя " + getEngineVolume()
                + "\n" + loadCapasity;
    }

    @Override
    public boolean diag(Driver driver) throws LicenseException {
        if (driver.getLicense() != "D") {
            throw new LicenseException();
        } else {
            return true;
        }
    }


}
