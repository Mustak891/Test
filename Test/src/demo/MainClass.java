package demo;

// Superclass
class Vehicle {
    String brand;
    int year;

    void startEngine() {
        System.out.println("Vehicle engine starts");
    }
}

// Subclass 1 (Single Inheritance)
class Car extends Vehicle {
    String fuelType;

    @Override
    void startEngine() {
        System.out.println("Car engine starts");
    }
    

    void drive() {
        System.out.println("Car is driving");
    }
}

// Subclass 2 (Hierarchical Inheritance)
class Truck extends Vehicle {
    int loadCapacity;

    @Override
    void startEngine() {
        System.out.println("Truck engine starts");
    }

    void haul() {
        System.out.println("Truck is hauling");
    }
}

// Main class to run
public class MainClass {
    public static void main(String[] args) {

        // Car object
        Car car = new Car();
        car.brand = "Toyota";
        car.year = 2022;
        car.fuelType = "Petrol";
        car.startEngine();
        car.drive();

        // Truck object
        Truck truck = new Truck();
        truck.brand = "Volvo";
        truck.year = 2020;
        truck.loadCapacity = 10000;
        truck.startEngine();
        truck.haul();
        
     // Polymorphism
        Vehicle v1 = new Car();
        v1.startEngine();
        Vehicle v2 = new Truck();
        v2.startEngine();
    }
}
