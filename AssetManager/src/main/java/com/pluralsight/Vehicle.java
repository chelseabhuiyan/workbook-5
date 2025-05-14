package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        // Houses
        assets.add(new House("My House", "2015-04-12", 250000, "123 Main St", 1, 2000, 7000));
        assets.add(new House("Vacation Home", "2018-06-21", 180000, "456 Lakeview Rd", 2, 1600, 5000));

        // Vehicles
        assets.add(new Vehicle("Tom's Truck", "2020-09-15", 30000, "Ford F-150", 2020, 120000));
        assets.add(new Vehicle("Daily Driver", "2019-03-01", 22000, "Toyota Corolla", 2019, 95000));

        for (Asset a : assets) {
            System.out.printf("\n%s\nAcquired: %s\nOriginal Cost: $%.2f\n",
                    a.getDescription(), a.getDateAcquired(), a.getOriginalCost());

            if (a instanceof House) {
                House house = (House) a;
                System.out.println("Type: House");
                System.out.println("Address: " + house.getAddress());
            }

            if (a instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) a;
                System.out.println("Type: Vehicle");
                System.out.printf("Make/Model: %s\nYear: %d\n", vehicle.getMakeModel(), vehicle.getYear());
            }

            System.out.printf("Current Value: $%.2f\n", a.getValue());
        }

    }
}
