package OOPS;

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with name & age
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with only name
    Student(String name) {
        this.name = name;
        this.age = 0;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();
        s1.display();

        // Using constructor with both name & age
        Student s2 = new Student("Harshit", 21);
        s2.display();

        // Using constructor with only name
        Student s3 = new Student("Amit");
        s3.display();
    }
}
