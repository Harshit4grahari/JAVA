package QUESTIONS;

// Superclass
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
    }
}

// Subclass
class Employee extends Person {
    String company;
    double salary;

    // Constructor using super()
    Employee(String name, int age, String company, double salary) {
        super(name, age); // call parent constructor
        this.company = company;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " works at " + company + " and earns ₹" + salary + " per month.");
    }
}

// Main class
public class Q14InheritanceCalc {
    public static void main(String[] args) {
        Employee emp = new Employee("Harshit", 21, "TCS", 60000);
        emp.introduce();  // from Person class
        emp.work();       // from Employee class
    }
}
