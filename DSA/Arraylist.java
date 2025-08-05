//ArrayList is a resizable array implementation of the List interface in Java. Unlike arrays, it can grow 
//or shrink in size dynamically, making it much more flexible.
//It belongs to the java.util package
// Key Features of ArrayList
//Can store duplicate elements
//Maintains insertion order
//Allows random access using index
//Null values are allowed
//Dynamic sizing (automatically resizes as you add/remove elements)
//Syntax;
//ArrayList<Type> list = new ArrayList<Type>();

package DSA;
import java.util.ArrayList;

public class Arraylist {
     public static void main(String[] args) {
        // ✅ Create ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // ✅ Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana"); // duplicates allowed

        // ✅ Access element by index
        System.out.println("First fruit: " + fruits.get(0));

        // ✅ Update element
        fruits.set(1, "Orange");

        // ✅ Remove element
        fruits.remove("Mango");

        // ✅ Size of list
        System.out.println("Total fruits: " + fruits.size());

        // ✅ Loop through ArrayList
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
