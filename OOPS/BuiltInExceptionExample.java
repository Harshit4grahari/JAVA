//exceptions are objects that represent errors or unusual situations 
//in a program. They are part of the Exception Handling mechanism 
//using try, catch, throw, throws, and finally

//Built-in Exceptions
//These are predefined exception classes provided
// by Java in the java.lang package.
package OOPS;

public class BuiltInExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // causes ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

