/* 1.LIFO (Last In, First Out)
   2.Operations:
     >push() → Insert element
     >pop() → Remove top element
     >peek() → View top element
     >empty() → Check if stack is empty
 */
package DSA;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Peek element
        System.out.println("Top element: " + stack.peek());

        // Pop element
        System.out.println("Popped: " + stack.pop());

        // Display stack after pop
        System.out.println("Stack after pop: " + stack);

        // Check if empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
