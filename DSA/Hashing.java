/*Hashing is the process of converting input data of any size into a fixed-size value (called a hash code or hash value) using a mathematical function called a hash function.
It’s used in data storage, retrieval, security, and indexing to achieve fast access.*/

package DSA;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, String> countryCapital = new HashMap<>();

        countryCapital.put("India", "New Delhi");
        countryCapital.put("USA", "Washington D.C.");
        countryCapital.put("Japan", "Tokyo");

        // Retrieve a value using key
        System.out.println("Capital of India: " + countryCapital.get("India"));
    }
}
/*1.Hash Function
>A function that takes an input (key) and returns an integer (hash code).
>Example: hashCode() method in Java.

2.Hash Table
>A data structure that stores key-value pairs in buckets based on the hash code.
>Used in HashMap, HashSet, and Hashtable.

3.Collision
>When two different keys have the same hash code.
>Resolved using:
>>Chaining (linked lists in buckets)
>>Open Addressing (probing for next free slot)

4.Performance
>Average: O(1) for insert/search/delete.
>Worst case: O(n) (if all elements land in the same bucket).

5.Applications of Hashing
>Fast searching (HashMap, HashSet)
>Database indexing
>Caching
>Cryptography (SHA, MD5, etc.)*/
/*Java provides:
>hashCode() method (in Object class) → Generates integer hash for the object.
>Used internally in HashMap, HashSet, etc.
>For custom objects, we must override both hashCode() and equals(). */