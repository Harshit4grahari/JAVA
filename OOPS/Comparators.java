/*>Package: java.util
>Purpose: Used to define custom sorting logic (outside the class).
>Method to implement: public int compare(T obj1, T obj2)
>How it works:
1.Can create multiple sorting strategies without changing the class itself.
2.Great for sorting by different fields (e.g., by name, by age, etc.). */

package OOPS;
import java.util.*;
class Student2 {
    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class Comparators {
    public static void main(String[] args) {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2(3, "John"));
        list.add(new Student2(1, "Alice"));
        list.add(new Student2(2, "Bob"));

        // Sort by name using Comparator
        Collections.sort(list, new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                return s1.name.compareTo(s2.name); // ascending order
            }
        });

        System.out.println("Sorted by Name: " + list);
    }
}
