/*Recursion is when a method calls itself to solve a problem.
The idea is to break a big problem into smaller subproblems until you reach a base case (a condition to stop recursion). 
>>Two Key Parts of Recursion
1.Base Case – the condition that stops the recursion (prevents infinite loops).
2.Recursive Case – the part where the function calls itself with a smaller/simpler input.*/

package BASICS;

public class Recursions {
    // Recursive method to calculate factorial
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

/*✅ Pros:
1.Shorter, cleaner code for complex problems.
2.Directly matches problem definitions (e.g., tree traversal).

⚠ Cons:
1.Higher memory usage (each call takes stack space).
2.Slower for some problems compared to iteration.
3.Risk of StackOverflowError if not stopped correctly. */