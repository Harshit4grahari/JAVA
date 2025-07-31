package OOPS;

class Student {
    String name;
    int age;

    // 1. Default Constructor
    Student() {
        name = "Not Assigned";
        age = 0;
        System.out.println("Default Constructor Called");
    }

    // 2. Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    // 3. Constructor Overloading - only name
    Student(String name) {
        this.name = name;
        this.age = 18; // default age
        System.out.println("Overloaded Constructor with Name Called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void setName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Calling Default Constructor
        Student s1 = new Student();
        s1.display();
        System.out.println();

        // Calling Parameterized Constructor
        Student s2 = new Student("Harshit", 20);
        s2.display();
        System.out.println();

        // Calling Overloaded Constructor
        Student s3 = new Student("Anjali");
        s3.display();
    }
}
