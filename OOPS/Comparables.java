/*>Package: java.lang
>Purpose: Used to define the natural ordering of objects (default sorting).
>Method to implement: public int compareTo(T obj)
>How it works:
1.Returns a negative integer → current object is "less than" the given object.
2.Returns zero → both are equal.
3.Returns a positive integer → current object is "greater than" the given object.
>Used with: Collections.sort() or any sorted collection like TreeSet, TreeMap. */

package OOPS;
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Natural sorting by id
    @Override
    public int compareTo(Student s) {
        return this.id - s.id; // ascending order
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class Comparables {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "John"));
        list.add(new Student(1, "Alice"));
        list.add(new Student(2, "Bob"));

        Collections.sort(list); // Uses compareTo()
        System.out.println("Sorted by ID: " + list);
    }
}
