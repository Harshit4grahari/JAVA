package OOPS;

// Superclass
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

// Subclass
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.start();   // Inherited from Vehicle
        myCar.drive();   // From Car
        myCar.stop();    // Inherited from Vehicle
    }
}
