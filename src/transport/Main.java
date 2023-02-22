package transport;

import drivers.DDriver;
import drivers.Driver;
import enums.Kuzov;
import enums.LoadCapasity;
import enums.NumberOfSeats;
import enums.TransportTypes;
import exceptions.LicenseException;

import data.Data;
import mechanic.Mechanic;
import sponsors.Sponsor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car honda = new Car("Honda", "Accord", 3.5,Kuzov.SEDAN);
        System.out.println(honda);
        Car lada = new Car("Lada","vesta",1.8,Kuzov.SEDAN);
        System.out.println(lada);
        Car bmv = new Car("BMV","x5",3.3,Kuzov.COUPE);
        System.out.println(bmv);
        Car audi = new Car("Audi", "A8",4.0,Kuzov.FURGON);
        System.out.println(audi);
        System.out.println();
        System.out.println();

        NumberOfSeats numberOfSeats = NumberOfSeats.VERY_BIG;
        Bus liaz = new Bus("Лиаз","Эг-17",3.0,numberOfSeats);
        System.out.println(liaz);
        Bus ikarus = new Bus("Ikarus","281",5.0, NumberOfSeats.FEW);
        System.out.println(ikarus);
        Bus fav = new Bus("Fav","Q-21",7.0, numberOfSeats);
        System.out.println(fav);
        Bus foton = new Bus("Foton", "Sky", 8.0, NumberOfSeats.VERY_LITTLE);
        System.out.println(foton);
        System.out.println();
        System.out.println();

        Truck tatra = new Truck("Tatra", "Elephant", 5.5,LoadCapasity.N1);
        System.out.println(tatra);
        Truck kamaz = new Truck("Kamaz","Mamont",5.5, LoadCapasity.N2);
        System.out.println(kamaz);
        Truck daf = new Truck("Daf","LF",6.0, LoadCapasity.N2);
        System.out.println(daf);
        Truck man= new Truck("Man","f2000",7.5, LoadCapasity.N2);
        System.out.println(man);


        Driver<Car> ivan = new Driver<>("Ivan", "B", 10, audi);
        ivan.drive();
        Driver<Bus> alex = new Driver<>("Alex", "C", 15, ikarus);
        alex.drive();
        DDriver denis = new DDriver("Denis", "D", 10, daf);


        try {
            System.out.println(man.diag(ivan));
        } catch (LicenseException e) {
            System.out.println(e);
        }


        try {
            System.out.println(ikarus.diag(ivan));
        } catch (LicenseException e) {
            System.out.println(e);
        }

        try {
            System.out.println(lada.diag(ivan));
        } catch (LicenseException e) {
            System.out.println(e);
        }

        audi.setKuzov(Kuzov.SEDAN);

        System.out.println(audi.getKuzov());

        try {
            System.out.println(Data.checkPassword("", "Andrei123", "Andrei123"));
        } catch (Exception e) {
            System.out.println(e);;
        }




        Mechanic mechanic = new Mechanic("Иван", "Иванов", "Компания", TransportTypes.ALL);

        Sponsor sponsor1 = new Sponsor("ООО Диалог", 1000, true);
        Sponsor sponsor2 = new Sponsor("ООО Монолог", 2000, true);





        ArrayList<Sponsor> sponsors = new ArrayList<>();
        sponsors.add(sponsor1);
        sponsors.add(sponsor2);


        Car carM = new Car("Audi", "3000", 30, Kuzov.SEDAN, mechanic, sponsors);


        Driver driver = new Driver("Васин И.И.", "B", 15, carM);


        System.out.println(honda.getMechanicName());



        System.out.println(carM.getMechanicName());
        System.out.println(carM.getSponsors());

        carM.printDriverName();



    }
}