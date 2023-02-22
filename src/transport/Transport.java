package transport;

import drivers.Driver;
import exceptions.LicenseException;
import mechanic.Mechanic;
import sponsors.Sponsor;

import java.util.ArrayList;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;


    private Driver driver;
    private ArrayList sponsors;
    private Mechanic mechanic;




    public Transport(String brand, String model, double engineVolume, Mechanic mechanic) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.sponsors = new ArrayList<>();
        this.mechanic = mechanic;
    }

    public Transport(String brand, String model, double engineVolume, Mechanic mechanic, ArrayList<Sponsor> sponsors) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.sponsors = sponsors;
        this.mechanic = mechanic;
    }

    public void printDriverName() {
        System.out.println("Имя водителя " + driver.getFio());
    }

    public void pitStop() {
        System.out.println("At a pit stop");
    }

    public void bestTime(){
        System.out.println("Best time");
    }

    public void maxSpeed() {
        System.out.println("max speed");
    }

    public void startMoving() {
    }

    public void finishTheMove() {

    }

    public abstract boolean diag(Driver driver) throws LicenseException;


    public String getMechanicName() {
        if (mechanic != null) {
            return "Механик машины: " + mechanic.getLastName() + " " + mechanic.getFirstName();
        }
        return "У машины механика нет";
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public ArrayList<Sponsor> getSponsors() {
        return sponsors;
    }
}
