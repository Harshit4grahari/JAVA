package OOPS;

class Employee {
    String name;
    int id;
    double salary;

    // 1. this used to resolve variable shadowing
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        System.out.println("Parameterized Constructor Called");
    }

    // 2. this() used to call another constructor
    Employee() {
        this("Not Assigned", 0, 0.0);
        System.out.println("Default Constructor Called");
    }

    // 3. this used for method chaining
    Employee setName(String name) {
        this.name = name;
        return this;
    }

    Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    // 4. this used to pass current object to another method
    void showDetails() {
        Utility.printEmployee(this);  // passing current object
    }

    // Display method
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + salary);
    }
}

// Helper class to demonstrate 'this' as method argument
class Utility {
    static void printEmployee(Employee e) {
        System.out.print("Employee Info: ");
        e.display();
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        System.out.println("1. Using this to resolve variable shadowing:");
        Employee e1 = new Employee("Harshit", 101, 50000);
        e1.display();

        System.out.println("\n2. Using this() to call another constructor:");
        Employee e2 = new Employee();
        e2.display();

        System.out.println("\n3. Using this for method chaining:");
        Employee e3 = new Employee().setName("Anjali").setSalary(75000);
        e3.display();

        System.out.println("\n4. Using this to pass object to another class:");
        e3.showDetails();
    }
}
