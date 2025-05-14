## workbook-5

# Vehicles Java Application

This project consists of a basic Java application that models different types of vehicles. It demonstrates inheritance by having a parent class `Vehicle` and several child classes (`Moped`, `Car`, `SemiTruck`, `Hovercraft`). Each vehicle class can be instantiated and has properties such as color, number of passengers, cargo capacity, and fuel capacity. 

## Project Structure

### 1. `Vehicle.java`

The `Vehicle` class serves as the **parent class** for all vehicle types. It contains the following properties:

- `color`: A string representing the color of the vehicle.
- `numberOfPassengers`: An integer representing the number of passengers the vehicle can carry.
- `cargoCapacity`: An integer representing the maximum cargo capacity (in kilograms).
- `fuelCapacity`: An integer representing the fuel capacity (in liters).

**Constructor:**
- The `Vehicle` class has a constructor that takes parameters to initialize all the properties.

**Methods:**
- Getter and setter methods for each property (`color`, `numberOfPassengers`, `cargoCapacity`, `fuelCapacity`).

### 2. `Moped.java`

The `Moped` class extends `Vehicle`. It represents a **moped** and uses the constructor of the parent `Vehicle` class to initialize its properties.

**Constructor:**
- The constructor takes parameters for `color`, `numberOfPassengers`, `cargoCapacity`, and `fuelCapacity`, and passes them to the `Vehicle` constructor using `super(...)`.

### 3. `Car.java`

The `Car` class extends `Vehicle`. It represents a **car** and uses the constructor of the parent `Vehicle` class to initialize its properties.

**Constructor:**
- Similar to `Moped`, the constructor of `Car` takes parameters for `color`, `numberOfPassengers`, `cargoCapacity`, and `fuelCapacity`, and calls the `Vehicle` constructor with `super(...)`.

### 4. `SemiTruck.java`

The `SemiTruck` class extends `Vehicle`. It represents a **semi-truck** and uses the parent `Vehicle` constructor.

**Constructor:**
- The constructor for `SemiTruck` takes parameters for `color`, `numberOfPassengers`, `cargoCapacity`, and `fuelCapacity`, and calls the `Vehicle` constructor using `super(...)`.

### 5. `Hovercraft.java`

The `Hovercraft` class extends `Vehicle`. It represents a **hovercraft** and uses the parent `Vehicle` constructor.

**Constructor:**
- Like the other subclasses, the `Hovercraft` constructor takes parameters for `color`, `numberOfPassengers`, `cargoCapacity`, and `fuelCapacity`, and calls the `Vehicle` constructor with `super(...)`.

### 6. `Main.java`

The `Main` class contains the `main` method, which demonstrates how to create and use instances of the `Moped`, `Car`, `SemiTruck`, and `Hovercraft` classes.

**Main Method:**
- Instances of each vehicle type (`Moped`, `Car`, `SemiTruck`, and `Hovercraft`) are created with specific values for their properties.
- It uses the getter methods to print out the values of each vehicle's properties to the console.

---
