/*TreeMap is a part of Java’s Collection Framework that implements the NavigableMap interface (which extends SortedMap).
It stores key-value pairs in a sorted order (by keys), using a Red-Black Tree internally */

package DSA;
import java.util.*;

public class TreeMaps {
     public static void main(String[] args) {
    // ------------------ Example 1: Basic TreeMap ------------------
        System.out.println("=== Example 1: Basic TreeMap ===");
        TreeMap<Integer, String> map1 = new TreeMap<>();

        // Adding elements
        map1.put(3, "Banana");
        map1.put(1, "Apple");
        map1.put(4, "Mango");
        map1.put(2, "Orange");

        // Display in sorted order by keys
        System.out.println("TreeMap: " + map1);

        // Access a value
        System.out.println("Value for key 2: " + map1.get(2));

        // Remove a key
        map1.remove(3);
        System.out.println("After removal: " + map1);
        System.out.println();

        // ------------------ Example 2: Custom Sorting ------------------
        System.out.println("=== Example 2: TreeMap with Custom Sorting ===");
        TreeMap<Integer, String> map2 = new TreeMap<>(Comparator.reverseOrder());

        map2.put(10, "A");
        map2.put(5, "B");
        map2.put(20, "C");

        System.out.println("TreeMap (Descending Order): " + map2);
        System.out.println();

        // ------------------ Example 3: Navigation Methods ------------------
        System.out.println("=== Example 3: TreeMap Navigation Methods ===");
        TreeMap<Integer, String> map3 = new TreeMap<>();
        map3.put(100, "A");
        map3.put(200, "B");
        map3.put(300, "C");

        System.out.println("TreeMap: " + map3);
        System.out.println("First Key: " + map3.firstKey());
        System.out.println("Last Key: " + map3.lastKey());
        System.out.println("Lower Key than 200: " + map3.lowerKey(200));
        System.out.println("Higher Key than 200: " + map3.higherKey(200));
    }
}


