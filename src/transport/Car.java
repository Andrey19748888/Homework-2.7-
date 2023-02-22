package transport;

import drivers.Driver;
import enums.Kuzov;
import exceptions.LicenseException;
import mechanic.Mechanic;
import sponsors.Sponsor;

import java.util.ArrayList;

public class Car extends Transport implements Competing{


    private Kuzov kuzov;

    public Car(String brand, String model, double engineVolume,Kuzov kuzov) {
        super(brand,model,engineVolume, null);
        this.kuzov = kuzov;
    }


    public Car(String brand, String model, double engineVolume,Kuzov kuzov, Mechanic mechanic) {
        super(brand,model,engineVolume, mechanic);
        this.kuzov = kuzov;
    }

    public Car(String brand, String model, double engineVolume, Kuzov kuzov, Mechanic mechanic, ArrayList<Sponsor> sponsors) {
        super(brand,model,engineVolume, mechanic, sponsors);
        this.kuzov = kuzov;
    }

    public String toString() {
        return  "бренд " + getBrand()
                + "\nмодель " + getModel()
                + "\nобъем двигателя " + getEngineVolume();
    }

    public Kuzov getKuzov() {
        return kuzov;
    }

    public void setKuzov(Kuzov kuzov) {
        this.kuzov = kuzov;
    }


    @Override
    public boolean diag(Driver driver) throws LicenseException {
        if ("B" != driver.getLicense()) {
            throw new LicenseException();
        } else {
            return true;
        }
    }
}

