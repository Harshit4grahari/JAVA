/*> We can get ListIterator cursor by ListIterator() method.
 ListIterator li = l.listIterator();
  > ListIterator cursor can be used only with list implemented classes i.e Arraylist, linkedlist, vector, stack.
  > ListIterator method are hasNext(), next(), hasPrevious(), previous(), remove(), set()
  > By using ListIterator cursor we can retrieve the element forword and backword directions.
 */
package DSA;

import java.util.*;

public class ListIterators {
    public static void main(String[] args) {
        // Create a list
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        // Get a ListIterator starting at index 0
        ListIterator<String> it = list.listIterator();

        System.out.println("Forward Traversal:");
        while (it.hasNext()) {
            String lang = it.next();
            System.out.println(lang);

            // Modify element during iteration
            if (lang.equals("C++")) {
                it.set("C#"); // Replace C++ with C#
            }

            // Add element after Python
            if (lang.equals("Python")) {
                it.add("Go"); // Insert "Go" right after "Python"
            }
        }

        System.out.println("\nBackward Traversal:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

        System.out.println("\nFinal List: " + list);
    }
}
