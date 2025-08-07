package DSA;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        // 🔰 Create and populate LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original List: " + list);

        // 1️⃣ Using Collections.reverse()
        LinkedList<String> list1 = new LinkedList<>(list); // copy original
        Collections.reverse(list1);
        System.out.println("Reversed using Collections.reverse(): " + list1);

        // 2️⃣ Using manual for loop
        LinkedList<String> list2 = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        System.out.println("Reversed using for loop: " + list2);

        // 3️⃣ Using descendingIterator()
        System.out.print("Reversed using descendingIterator(): [");
        Iterator<String> itr = list.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next());
            if (itr.hasNext()) System.out.print(", ");
        }
        System.out.println("]");
    }
}
