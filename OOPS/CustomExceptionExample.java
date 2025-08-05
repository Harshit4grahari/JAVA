//Custom Exceptions
//You can define your own exception class by extending Exception or RuntimeException. 
//Use it when you want to throw an error with your own logic/message.
//🛠 Steps:
//Create a custom class that extends Exception (for checked) or RuntimeException (for unchecked).
//Use throw keyword to raise the exception.

package OOPS;

// Custom exception
class AgeTooSmallException extends Exception {
    public AgeTooSmallException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    static void checkAge(int age) throws AgeTooSmallException {
        if (age < 18) {
            throw new AgeTooSmallException("Age must be 18 or above to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeTooSmallException e) {
            System.out.println("Custom Error: " + e.getMessage());
        }
    }
}
