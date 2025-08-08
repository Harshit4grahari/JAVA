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
