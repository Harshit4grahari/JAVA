package OOPS;

// Define a class
public class ClassStudent {

    // Fields (instance variables)
    String name;
    int age;
    String branch;

    // Constructor
    ClassStudent(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }

    // Static method - belongs to class, not instance
    static void collegeInfo() {
        System.out.println("College: XYZ Institute of Technology");
    }

    // Main method
    public static void main(String[] args) {
        // Create objects of ClassnameStudent
        ClassStudent s1 = new ClassStudent("Harshit", 20, "CSE");
        ClassStudent s2 = new ClassStudent("Anjali", 21, "ECE");

        // Call instance methods
        s1.displayDetails();
        System.out.println();
        s2.displayDetails();

        System.out.println();

        // Call static method
        ClassStudent.collegeInfo();
    }
}
