package mechanic;

import enums.TransportTypes;
import transport.Transport;

public class Mechanic {
    private final String firstName;
    private final String lastName;
    private final String company;
    private final TransportTypes transportType;

    public Mechanic(String firstName, String lastName, String company, TransportTypes transportType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.transportType = transportType;
    }

    public void carryOutMaintenance() {
        System.out.printf("Механик %s %s проводит техобслуживание", getFirstName(), getLastName());
    }

    public void fixCar(Transport transport) {
        System.out.printf("Механик %s %s чинит транспорт %s %s", lastName, firstName, transport.getBrand(), transport.getModel());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

//    public String getTransportType() {
//        return transportType;
//    }
}
