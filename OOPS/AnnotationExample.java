//What is an Annotation in Java?
//In Java, an annotation is a special kind of metadata added to Java code elements such as:
//classes
//methods
//variables
//parameters
//packages
//It does not affect program logic directly, but it provides information to the compiler or runtime.

//Why Use Annotations?
//To give instructions to the compiler (e.g., @Override)
//To influence runtime behavior (e.g., in frameworks like Spring, JUnit)
//To help with code generation and dependency injection
package OOPS;

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class AnnotationExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Polymorphism
        myDog.sound();             // Outputs: Dog barks
    }
}

