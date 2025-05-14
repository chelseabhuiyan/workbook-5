package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("Main House", "2015-03-20", 250000,
                "123 Maple Ave", 1, 1600, 5000));
        assets.add(new House("Vacation House", "2018-07-11", 200000,
                "456 Lake View", 2, 1400, 8000));
        assets.add(new Vehicle("Tom's Truck", "2020-04-15", 35000,
                "Ford F150", 2019, 120000));
        assets.add(new Vehicle("Daily Driver", "2017-06-05", 28000,
                "Toyota Camry", 2016, 98000));
        assets.add(new Cash("Emergency Fund", "2023-01-01", 1500));

        for (Asset a : assets) {
            System.out.printf("\n%s\nAcquired: %s\nOriginal Cost: $%.2f\n",
                    a.getDescription(), a.getDateAcquired(), a.getOriginalCost());

            if (a instanceof House) {
                House h = (House) a;
                System.out.println("Type: House");
                System.out.println("Address is: " + h.getAddress());
            } else if (a instanceof Vehicle) {
                Vehicle v = (Vehicle) a;
                System.out.println("Type: Vehicle");
                System.out.printf("Make and Model: %s\nYear: %d\n", v.getMakeModel(), v.getYear());
            } else if (a instanceof Cash) {
                System.out.println("Type: Cash");
            }

            System.out.printf("Current Value: $%.2f\n", a.getValue());
        }
    }
}
