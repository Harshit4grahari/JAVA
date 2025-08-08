/*TreeSet is a part of Java Collections Framework that implements the NavigableSet
 interface (which extends SortedSet).It stores unique elements in sorted order (ascending by default) and uses a Red-Black Tree internally. */
/*Syntax: TreeSet<Type> set = new TreeSet<>();*/
package DSA;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        // Creating a TreeSet of Integers
        TreeSet <Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        // Duplicate element (will be ignored)
        numbers.add(20);

        // Display elements (sorted automatically)
        System.out.println("TreeSet: " + numbers);

        // First and Last element
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());

        // Remove element
        numbers.remove(30);
        System.out.println("After removing 30: " + numbers);

        // Contains check
        System.out.println("Contains 20? " + numbers.contains(20));

        // HeadSet, TailSet, SubSet
        System.out.println("HeadSet (<30): " + numbers.headSet(30));
        System.out.println("TailSet (>=30): " + numbers.tailSet(30));
        System.out.println("SubSet (>=10 and <40): " + numbers.subSet(10, 40));
    }
}
/* Key Points
1.Sorted & Unique:
>Automatically sorts elements in ascending order (can be customized with a Comparator).
>Duplicate elements are not allowed.

2.Underlying Data Structure:
>Self-balancing Red-Black Tree (ensures O(log n) performance for basic operations).

3.Null Handling:
>Only one null element allowed if no comparator is used and if null is the first element inserted.
>Throws NullPointerException if you try to insert null when a comparator is used or if ordering doesn't allow it.

4.Ordering:
Natural ordering (e.g., numbers ascending, strings alphabetically)
Or custom ordering using Comparator.

5.Performance:
>add, remove, contains → O(log n)
>iteration → O(n).*/