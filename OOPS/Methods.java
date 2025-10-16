package OOPS;

// Superclass
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Subclass
class Bike extends Vehicle {
    // Overriding method
    @Override
    void run() {
        System.out.println("Bike is running fast");
    }

    // Overloaded method
    void run(String type) {
        System.out.println("Bike type: " + type);
    }
}

// Main class (file name should be Methods.java)
public class Methods {
    public static void main(String[] args) {
        Bike b = new Bike();

        // Calling overridden method
        b.run();

        // Calling overloaded method
        b.run("Sport");
    }
}
