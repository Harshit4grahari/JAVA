package OOPS;

// Abstract class
abstract class Shape {
    // Abstract method
    abstract double area();

    // Concrete method
    void display() {
        System.out.println("Calculating area...");
    }
}

// Subclass: Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.display();
        System.out.println("Circle Area: " + circle.area());

        rectangle.display();
        System.out.println("Rectangle Area: " + rectangle.area());
    }
}
