///In Java, methods are blocks of code that perform specific tasks and can be called when needed. Methods can have:
//Parameters: Inputs passed into the method.
//Return Type: Type of value the method returns. If it doesn’t return anything, it's void.
//Basics Syntax:
//returnType methodName(type1 param1, type2 param2, ...) {
    // method body
//   return value; // if returnType is not void
//}





package BASICS;

public class Method {

    // Method with no parameters and no return type
    public void greet() {
        System.out.println("Hello, World!");
    }

    // Method with parameters and no return type
    public void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method with parameters and return type
    public int multiply(int x, int y) {
        return x * y;
    }

    // Method with no parameters but with return type
    public String getName() {
        return "John";
    }

    // Method Overloading: add(int, int)
    public int add(int a, int b) {
        return a + b;
    }

    // Method Overloading: add(double, double)
    public double add(double a, double b) {
        return a + b;
    }

    // main method to run the program
    public static void main(String[] args) {
        // Create object to call non-static methods
        Method obj = new Method();

        // Calling all methods
        obj.greet();  // Method 1

        obj.printSum(10, 15);  // Method 2

        int product = obj.multiply(4, 5);  // Method 3
        System.out.println("Product: " + product);

        String name = obj.getName();  // Method 4
        System.out.println("Name: " + name);

        int sumInt = obj.add(3, 7);  // Overloaded method (int)
        System.out.println("Sum (int): " + sumInt);

        double sumDouble = obj.add(2.5, 3.7);  // Overloaded method (double)
        System.out.println("Sum (double): " + sumDouble);
    }
}

