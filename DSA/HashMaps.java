/* HashMap is a part of the Java Collections Framework and implements the Map interface.
It stores key-value pairs and allows fast access using keys.
Internally, it uses a hash table for constant-time performance (O(1) average) for get() and put() operations*/
/*Syntax: HashMap<KeyType, ValueType> map = new HashMap<>(); */
package DSA;
import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // Adding key-value pairs
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);

        // Duplicate key (overwrites old value)
        studentMarks.put("Alice", 90);

        // Null key and value
        studentMarks.put(null, 100);
        studentMarks.put("David", null);

        // Display the HashMap
        System.out.println("Student Marks: " + studentMarks);

        // Accessing a value by key
        System.out.println("Marks of Bob: " + studentMarks.get("Bob"));

        // Checking if a key or value exists
        System.out.println("Contains key 'Charlie'? " + studentMarks.containsKey("Charlie"));
        System.out.println("Contains value 92? " + studentMarks.containsValue(92));

        // Removing a key-value pair
        studentMarks.remove("Charlie");
        System.out.println("After removing Charlie: " + studentMarks);

        // Iterating over keys and values
        System.out.println("\nIterating over entries:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
/* #Key Points
1.Key-Value Storage
>Each entry in a HashMap has a key (unique) and a value (can be duplicate).
>Keys must be unique; if you insert an existing key, its value gets overwritten.

2.Null Handling
>Allows one null key.
>Allows multiple null values.

3.Order
>Not ordered and not sorted.
>If you need ordering, use LinkedHashMap (insertion order) or TreeMap (sorted order).

4.Performance
>Average: O(1) for put(), get(), remove().
>Worst case: O(n) if many keys have the same hash code (hash collisions).

5.Thread Safety
>Not synchronized → multiple threads can cause issues.
>Use Collections.synchronizedMap() or ConcurrentHashMap for thread safety. */