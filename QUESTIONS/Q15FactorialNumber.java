//Using recursion
package QUESTIONS;

public class Q15FactorialNumber {
    static int factorial(int n) {
        if (n == 0 || n == 1) { // Base Case
            return 1;
        }
        return n * factorial(n - 1); // Recursive Call
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " = " + factorial(num));
    }
}
