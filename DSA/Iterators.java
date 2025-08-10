/*> We can get Iterator cursor by iterator() method
 Iterator itr = l.iterator();
  > Iterator cursor can be used with any collection object.
  > Iterator methods are- hasNext(), nextt(), remove()
  > By using iterator cursor  */
package DSA;
import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        // Create a list
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        // Get an iterator
        Iterator<String> it = list.iterator();

        System.out.println("Traversing the list using Iterator:");
        while (it.hasNext()) {
            String lang = it.next();
            System.out.println(lang);

            // Remove "C++" while iterating
            if (lang.equals("C++")) {
                it.remove(); // Safe removal
            }
        }

        System.out.println("After removal: " + list);
    }

}
/*Key Points
1.Fail-Fast:
>If the collection is structurally modified after creating the iterator (except via remove()), the iterator will throw ConcurrentModificationException.

2.Advantages:
>Works on any Collection type (List, Set, Queue, etc.).
>Safer element removal during iteration compared to a for-each loop.

3.Limitations:
>Forward-only traversal.
>No index-based access (unlike a normal loop). */