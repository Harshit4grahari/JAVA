package OOPS;

// Parent (superclass)
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }

    void sleep() {
        System.out.println("This animal sleeps");
    }
}

// Child (subclass) - inherits Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();    // inherited method
        d.sleep();  // inherited method
        d.bark();   // child class method
    }
}
