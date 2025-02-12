package org.example.Collections_8;

public class Map {
    public static void main(String[] args) {
//        What is a Map in Java?
//        A Map is a part of Java’s Collection Framework that stores key-value pairs. Unlike List and Set,
//        a Map does not allow duplicate keys, but values can be duplicated. It is useful when we need to
//        associate a unique key with a value, like storing student roll numbers and their names.

//       📝 Key Points about Map:
//       ✅ Stores data in key-value pairs (key → value).
//       ✅ Keys must be unique (Duplicate keys are not allowed).
//       ✅ Values can be duplicated (Multiple keys can have the same value).
//       ✅ Not a part of the Collection interface, but part of java.util package.
//       ✅ Implements hashing and tree structures for efficient retrieval


//
//        Types of Map Implementations in Java
//        Java provides different types of Map implementations:

//        1️⃣ HashMap → Stores elements in an unordered way using hashing.
//        2️⃣ LinkedHashMap → Maintains insertion order of keys.
//        3️⃣ TreeMap → Stores elements in sorted order of keys.
//        4️⃣ Hashtable → Similar to HashMap, but thread-safe.


//        1. HashMap (Most Commonly Used)
//        HashMap uses hashing to store data and provides O(1) average time complexity for insertion, deletion,
//        and retrieval.

//      🔹 Features:
//      ✔ Fast performance (No ordering of keys).
//      ✔ Allows null keys and values.
//      ✔ Not thread-safe (Not synchronized).


//        Map<Integer, String> map = new HashMap<>();

        // Adding elements
//        map.put(101, "Alice");
//        map.put(102, "Bob");
//        map.put(103, "Charlie");

        // Retrieving values
//        System.out.println("Value for key 102: " + map.get(102));

        // Iterating through keys and values
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }

//
//        2. LinkedHashMap (Maintains Insertion Order)
//        Unlike HashMap, LinkedHashMap preserves the insertion order of keys.
//
//        Map<Integer, String> map = new LinkedHashMap<>();
//        map.put(2, "Banana");
//        map.put(1, "Apple");
//        map.put(3, "Cherry");
//        System.out.println(map);
//        Output: {2=Banana, 1=Apple, 3=Cherry}  (Insertion order is preserved)


//        3. TreeMap (Sorted Order of Keys)
//        TreeMap stores elements in ascending order of keys (by default).

//        Map<Integer, String> map = new TreeMap<>();
//        map.put(3, "Banana");
//        map.put(1, "Apple");
//        map.put(2, "Cherry");
//
//        System.out.println(map);
//        Output: {1=Apple, 2=Cherry, 3=Banana}  (Sorted order by keys)

//        4. Hashtable (Thread-Safe, Synchronized)
//        Hashtable is similar to HashMap, but it is synchronized (thread-safe). It does not allow null keys or values.

//        Map<Integer, String> map = new Hashtable<>();
//        map.put(1, "A");
//        map.put(2, "B");
//        System.out.println(map);
//        Output: {1=A, 2=B}

//        Operations in Map
//       1 Adding elements:
//        map.put(101, "Alice");
//        map.put(102, "Bob");

//       2. Getting a value by key:
//        System.out.println(map.get(101));  // Output: Alice

//       3. Checking if a key exists:
//        System.out.println(map.containsKey(102));  // Output: true

//       4.Checking if a value exists:
//        System.out.println(map.containsValue("Alice"));  // Output: true

//        5.Removing a key-value pair:
//        map.remove(102);  // Removes key 102 and its value

//        6.Iterating through a Map:
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }


//            Use HashMap when you just need fast key-value lookups.
//            Use LinkedHashMap if you need ordered keys (insertion order).
//            Use TreeMap if you need keys to be sorted.
//            Use Hashtable if you need thread safety.






    }
}
