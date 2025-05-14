package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped newMoped = new Moped("red",1,0,5);

        Car newCar = new Car("blue",4,100, 40);


        SemiTruck newTruck = new SemiTruck("white",4,1000,150);

        Hovercraft newHoverCraft = new Hovercraft("Silver", 6, 10,80);


        // Output test
        System.out.println("Moped color: " + newMoped.getColor());
        System.out.println("Car passengers: " + newCar.getNumberOfPassengers());
        System.out.println("Truck cargo capacity: " + newTruck.getCargoCapacity());
        System.out.println("Hovercraft fuel capacity: " + newHoverCraft.getFuelCapacity());
    }
}
