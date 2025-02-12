package org.example.Collections_8;
import java.util.*;
public class HashMap {
    public static void main(String[] args) {
//        HashMap Operations in Java
//        The HashMap class is a part of the Java Collections Framework and implements the Map interface. It stores
//        data in key-value pairs and is known for its fast lookups and unsorted nature. Here is a detailed explanation
//        of all the main operations you can perform on a HashMap.

//        1. put(K key, V value)
//        Description: Adds a key-value pair to the HashMap.
//        Returns: If the key already exists, it updates the value and returns the previous value. If the key is new, it returns null

//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "Alice");  // Adds key-value pair (1, "Alice")
//        map.put(2, "Bob");    // Adds key-value pair (2, "Bob")

//        2. putAll(Map<? extends K, ? extends V> m)
//        Description: Copies all the entries from the provided map m into this HashMap
//        Returns: None

//        Map<Integer, String> newMap = new HashMap<>();
//        newMap.put(3, "Charlie");
//        newMap.put(4, "David");
//        map.putAll(newMap);  // Adds all the entries from newMap to map

//        3. get(Object key)
//        Description: Retrieves the value associated with the specified key.
//        Returns: The value associated with the key, or null if no mapping exists for the key.
//        String value = map.get(1);  // Returns "Alice"

//        4. containsKey(Object key)
//        Description: Checks if the HashMap contains the specified key.
//        Returns: true if the key exists, otherwise false.
//        boolean hasKey = map.containsKey(2);  // Returns true because key 2 exists
//
//        5. containsValue(Object value)
//        Description: Checks if the HashMap contains the specified value.
//        Returns: true if the value exists, otherwise false.
//        boolean hasValue = map.containsValue("Alice");  // Returns true because "Alice" is a value

//        6. remove(Object key)
//        Description: Removes the key-value pair associated with the specified key.
//        Returns: The value associated with the removed key, or null if no mapping exists.
//        String removedValue = map.remove(2);  // Removes the entry for key 2 (value "Bob")

//        7. size()
//        Description: Returns the number of key-value pairs in the HashMap.
//        Returns: The number of key-value pairs.
//        int size = map.size();  // Returns the number of key-value pairs

//        8. isEmpty()
//        Description: Checks if the HashMap is empty.
//        Returns: true if the map is empty, otherwise false.
//        boolean isEmpty = map.isEmpty();  // Returns false if the map has elements

//        9. keySet()
//        Description: Returns a Set view of all the keys in the HashMap.
//        Returns: A Set containing all the keys.
//        Set<Integer> keys = map.keySet();  // Returns the set of keys
//
//        10. values()
//        Description: Returns a Collection view of all the values in the HashMap.
//        Returns: A Collection containing all the values.
//        Collection<String> values = map.values();  // Returns the collection of values

//        11. entrySet()
//        Description: Returns a Set view of the key-value pairs (entries) in the HashMap.
//        Returns: A Set of Map.Entry objects, each representing a key-value pair.
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for (Map.Entry<Integer, String> entry : entries) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

//        12. clear()
//        Description: Removes all the entries from the HashMap.
//        Returns: None
//        map.clear();  // Clears all entries from the map

//        13. replace(K key, V value)
//        Description: Replaces the value for the specified key if it is present.
//        Returns: The previous value associated with the key, or null if no mapping
//        map.replace(1, "Alex");  // Replaces the value for key 1 with "Alex"

//        14. replace(K key, V oldValue, V newValue)
//        Description: Replaces the old value associated with the specified key only if it is currently mapped to the given value.
//        Returns: true if the value was replaced, otherwise false
//        boolean replaced = map.replace(1, "Alice", "Alex");  // Replaces "Alice" with "Alex"
//
//        15. putIfAbsent(K key, V value)
//        Description: Adds the key-value pair only if the key is not already associated with a value.
//        Returns: null if the key was not already present, otherwise it returns the current value associated with the key.
//        map.putIfAbsent(5, "Eve");  // Adds (5, "Eve") only if key 5 is not already present














//













    }
}
