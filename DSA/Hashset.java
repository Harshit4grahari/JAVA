//HashSet is a part of the Java Collection Framework and implements 
//the Set interface. It stores unique elements only (no duplicates) and uses a hash table for storage.
//Feature -	Description
//Implements - Set interface
//Duplicate Elements - Not allowed
//Order Maintained? - No (unordered and unsorted)
//Null Elements - Allows at most one null
//Underlying Structure	- Uses a HashTable
//Performance	- Constant time for basic operations (O(1))

package DSA;
import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {
        //Creating Hashset of Strings
        HashSet<String> fruits = new HashSet<>();
        
        //Adding Elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");

        //Print Hashset
        System.out.println("Fruits: " + fruits);

        //chwck if elements exit
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Size of HashSet
        System.out.println("Size: " + fruits.size());

        // Iterating over HashSet
        System.out.println("Iterating:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
