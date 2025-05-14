package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car newCar = new Car();
        newCar.setColor("Blue");
        newCar.setNumberOfPassengers(4);
        newCar.setFuelCapacity(40);

        SemiTruck newTruck = new SemiTruck();
        newTruck.setColor("White");
        newTruck.setCargoCapacity(10000);
        newTruck.setFuelCapacity(150);

        Hovercraft newHoverCraft = new Hovercraft();
        newHoverCraft.setColor("Silver");
        newHoverCraft.setNumberOfPassengers(6);
        newHoverCraft.setFuelCapacity(80);

        // Output test
        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Car passengers: " + newCar.getNumberOfPassengers());
        System.out.println("Truck cargo capacity: " + newTruck.getCargoCapacity());
        System.out.println("Hovercraft fuel capacity: " + newHoverCraft.getFuelCapacity());
    }
}
