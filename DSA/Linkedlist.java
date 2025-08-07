//LinkedList is a part of Java's Collection Framework and implements both the List and Deque interfaces. It represents a doubly-linked list
// — where each node holds data and links to both previous and next nodes
//Key Features:
//Dynamic size (no need to define capacity)
//Fast insertion & deletion (especially at start or middle)
//Allows duplicates & null values
//Maintains insertion order
//Can be used as a List, Stack, or Queue
//Syntax; LinkedList<Type> list = new LinkedList<>();

package DSA;
import java.util.LinkedList;

public class Linkedlist {
     public static void main(String[] args) {
        // ✅ Create LinkedList of Strings
        LinkedList<String> cities = new LinkedList<>();

        // Add elements
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Chennai");

        // Add at specific index
        cities.add(1, "Bangalore");

        // Print list
        System.out.println("Cities: " + cities);

        // Remove element
        cities.remove("Mumbai");
        cities.removeFirst(); // removes Delhi
        cities.removeLast();  // removes Chennai

        // Get and set elements
        System.out.println("First city: " + cities.getFirst());
        cities.set(0, "Hyderabad");

        // Final list
        System.out.println("Updated Cities: " + cities);
    }
}
