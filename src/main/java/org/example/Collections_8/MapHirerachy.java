package org.example.Collections_8;

public class MapHirerachy {
    public static void main(String[] args) {
//        Map Hierarchy in Java :----
//        The Map interface in Java is a part of the Java Collections Framework and is used to store data in
//        key-value pairs. Unlike the Collection interface, the Map interface does not extend it. A Map allows
//        one-to-one mapping between keys and values.

//        Map (Interface)
//          │
//    ┌─────┴─────┐
//    │           │
//        HashMap   LinkedHashMap
//    │           │
//        TreeMap   Hashtable
//               │
//        Properties


//        Key Points About Map in Java

//        Key-Value Pair Storage: Data is stored as key-value pairs.
//        Unique Keys: Keys are unique in the Map, but values can be duplicated.
//        No Duplicates: Duplicate keys are not allowed, but duplicate values can exist.
//        Not Part of Collection Interface: Unlike List, Set, and Queue, the Map interface does not extend the Collection interface.
//        Implementations: HashMap, LinkedHashMap, TreeMap, Hashtable, Properties are some of the common implementations of Map.

//
//        Operations of Map Interface in Java

//        1. put(K key, V value)
//        Description: Adds a key-value pair to the map.
//        Returns: Returns the previous value associated with the key, or null if there was no mapping for the key.
//        map.put(101, "Alice");  // Adds a key-value pair with key 101 and value "Alice"

//
//        2. putAll(Map<? extends K, ? extends V> m)
//        Description: Copies all the mappings from the specified map to this map.
//        Returns: None
//        Map<Integer, String> newMap = new HashMap<>();
//        newMap.put(102, "Bob");
//        newMap.put(103, "Charlie");
//        map.putAll(newMap);  // Adds all entries from newMap to map

//        3. get(Object key)
//        Description: Retrieves the value associated with the specified key.
//        Returns: Returns the value associated with the key, or null if no mapping exists.
//        String name = map.get(101);  // Returns "Alice"

//        4. containsKey(Object key)
//        Description: Checks whether the map contains a mapping for the specified key.
//        Returns: true if the map contains the key, otherwise false.
//        boolean contains = map.containsKey(102);  // Returns true if key 102 exists

//        5. containsValue(Object value)
//        Description: Checks whether the map contains one or more keys mapping to the specified value.
//        Returns: true if the value is present, otherwise false.
//        boolean containsValue = map.containsValue("Alice");  // Returns true if value "Alice" exists


//        6. remove(Object key)
//        Description: Removes the key-value pair associated with the specified key.
//        Returns: The value associated with the key, or null if no mapping exists for the key.
//        String removedValue = map.remove(102);  // Removes the key-value pair for key 102
//
//        7. size()
//        Description: Returns the number of key-value pairs in the map.
//        Returns: The number of key-value pairs in the map.
//        int size = map.size();  // Returns the size of the map

//        8. isEmpty()
//        Description: Checks if the map is empty.
//        Returns: true if the map contains no key-value pairs, otherwise false.
//        boolean isEmpty = map.isEmpty();  // Returns true if the map is empty

//        9. keySet()
//        Description: Returns a Set view of the keys contained in the map.
//        Returns: A Set containing all the keys in the map.
//        Set<Integer> keys = map.keySet();  // Returns the set of keys

//        10. values()
//        Description: Returns a Collection view of the values contained in the map.
//        Returns: A Collection containing all the values in the map.
//        Collection<String> values = map.values();  // Returns the collection of values

//        11. entrySet()
//        Description: Returns a Set view of the key-value mappings contained in the map.
//        Returns: A Set of Map.Entry objects, each containing a key-value pair.
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for (Map.Entry<Integer, String> entry : entries) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }


//        12. clear()
//        Description: Removes all key-value pairs from the map.
//        Returns: None
//        map.clear();  // Clears all the entries in the map


//        Key Implementations of Map
//        1. HashMap
//        Description: Stores elements in an unordered way using hashing. Provides O(1) average time complexity for insertion, deletion, and retrieval.
//        Allows: null key and null values.
//        Not thread-safe.
//        Map<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(1, "Alice");


//        2. LinkedHashMap
//        Description: Similar to HashMap, but maintains insertion order. It stores elements in the order in which they were inserted.
//        Allows: null key and null values.
//        Not thread-safe.
//        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put(1, "Alice");
//        linkedHashMap.put(2, "Bob");


//        3. TreeMap
//        Description: Stores elements in a sorted order of keys (ascending by default).
//        Does not allow null keys.
//        Implements SortedMap interface.
//        Map<Integer, String> treeMap = new TreeMap<>();
//        treeMap.put(3, "Charlie");
//        treeMap.put(1, "Alice");


//        4. Hashtable
//        Description: A synchronized version of HashMap. Provides thread-safety at the cost of performance.
//        Does not allow null keys and values.
//        Map<Integer, String> hashtable = new Hashtable<>();
//        hashtable.put(1, "Alice");

//        5. Properties
//        Description: A subclass of Hashtable used for configuration purposes. It is often used to load and store key-value pairs from properties files.
//        Does not allow null keys or values.
//        Properties properties = new Properties();
//        properties.setProperty("username", "admin");
//        properties.setProperty("password", "admin123");


//        Iteration Over Maps
//        1. Using entrySet()
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

//        2. Using keySet()
//        for (Integer key : map.keySet()) {
//            System.out.println("Key: " + key + " Value: " + map.get(key));
//        }

//        3. Using values()
//        for (String value : map.values()) {
//            System.out.println("Value: " + value);
//        }

//        Use HashMap if you don't care about order and need fast lookups.
//        Use LinkedHashMap if you want to maintain insertion order.
//        Use TreeMap if you need the keys to be sorted.
//        Use Hashtable if you need thread safety but don't mind slower performance.




























    }

}
