package OOPS;

// Superclass
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Subclass
class Bike extends Vehicle {
    // Overriding
    @Override
    void run() {
        System.out.println("Bike is running fast");
    }

    // Overloading
    void run(String type) {
        System.out.println("Bike type: " + type);
    }
}

// Main class (must match file name if public)
public class Methods {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();           // overridden method
        b.run("Sport");    // overloaded method
    }
}
