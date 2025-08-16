/* 1.FIFO (First In, First Out)
   2.Operations:
    >add() / offer() → Insert element
    >remove() / poll() → Remove element
    >peek() → View first element
    >isEmpty() → Check if queue is empty */
    
package DSA;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Add elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        // Peek element
        System.out.println("Front element: " + queue.peek());

        // Remove element
        System.out.println("Removed: " + queue.remove());

        // Display queue after remove
        System.out.println("Queue after remove: " + queue);

        // Check if empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}

