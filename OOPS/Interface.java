//An interface is a pure abstraction.

//All methods in an interface are abstract by default (until Java 7).

//A class implements an interface and defines its methods.




package OOPS;

// Interface declaration
interface PowerControl {
    void turnOn();   // abstract method
    void turnOff();  // abstract method
}

// Implementing class 1
class Fan implements PowerControl {
    public void turnOn() {
        System.out.println("Fan is turned ON");
    }

    public void turnOff() {
        System.out.println("Fan is turned OFF");
    }
}

// Implementing class 2
class Light implements PowerControl {
    public void turnOn() {
        System.out.println("Light is turned ON");
    }

    public void turnOff() {
        System.out.println("Light is turned OFF");
    }
}
//Main Class
public class Interface {
    public static void main(String[] args) {
        PowerControl fan = new Fan();
        PowerControl light = new Light();

        fan.turnOn();     // Output: Fan is turned ON
        fan.turnOff();    // Output: Fan is turned OFF

        light.turnOn();   // Output: Light is turned ON
        light.turnOff();  // Output: Light is turned OFF
    }
}
