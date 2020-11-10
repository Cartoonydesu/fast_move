package data;

import base.Bike;
import base.Parcel;
import base.Person;
import base.Location;
import base.ParcelStatus;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        Bike b1 = new Bike("b1",1);
        Bike b2 = new Bike("b2",2);
        Bike b3 = new Bike("b3",3);
        bikes[0] = b1;
        bikes[1] = b2;
        bikes[2] = b3;
        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        Person a = new Person("a","a");
        Person b = new Person("b","b");
        Person c = new Person("c","c");
        person[0] = a;
        person[1] = b;
        person[2] = c;
        //person[0] = new Person("a","a");
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        Location l = new Location(0.0,0.0);
        //parcels[0] = new Parcel(1.0,ParcelStatus.SHIPPING,new Location(3.0,3.0));
//        parcels[0] = new Parcel(1.0,ParcelStatus.SHIPPING,l);
//        parcels[1] = new Parcel(1.0,ParcelStatus.SHIPPING,l);
//        parcels[2] = new Parcel(1.0,ParcelStatus.SHIPPING,l);
//        parcels[3] = new Parcel(1.0,ParcelStatus.SHIPPING,l);
//        parcels[4] = new Parcel(1.0,ParcelStatus.SHIPPING,l);
//        parcels[5] = new Parcel(1.0,ParcelStatus.SHIPPING,l);
//        parcels[6] = new Parcel(1.0,ParcelStatus.SHIPPING,l);
//        parcels[7] = new Parcel(1.0,ParcelStatus.SHIPPING,l);
//        parcels[8] = new Parcel(1.0,ParcelStatus.SHIPPING,l);
//        parcels[9] = new Parcel(1.0,ParcelStatus.SHIPPING,l);
        for (int i = 0; i < parcels.length; i++) {
            parcels[i] = new Parcel(1.0,ParcelStatus.SHIPPING,l);
            
        }

        return parcels;
    }

    //testing--------------------------------------------------------------
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }
    //testing--------------------------------------------------------------

    public static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
