package QUESTIONS;

public class Q16FibonacciRecursion {
    static int fibonacci(int n) {
        if (n <= 1) { // Base case
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        int terms = 7;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
}
