package org.example.Collections_8;

public class TreeSet {
    public static void main(String[] args) {
//        what is TreeSet in Java
//        TreeSet ek Sorted Set hai jo NavigableSet Interface ko implement karta hai.
//        Ye elements ko ascending order me store karta hai aur duplicates allow nahi karta.
//        Internally, ye Balanced Tree (Red-Black Tree) ka use karta hai.


//        1. TreeSet Create Karna
//        TreeSet<Integer> ts = new TreeSet<>(); // Empty TreeSet
//        ts.add(30);
//        ts.add(10);
//        ts.add(20);

//        🔹 TreeSet elements automatically sorted hote hain.
//        🔹 Duplicate values nahi store hoti.


//        ✅ 1. Element Insert Karna (add())
//        ts.add(5);
//        ts.add(25);
//        System.out.println(ts); // Output: [5, 10, 20, 25, 30]


//        TreeSet<Integer> ts = new TreeSet<>();
//
//        // Elements Add Karna
//        ts.add(30);
//        ts.add(10);
//        ts.add(20);
//        ts.add(5);
//        ts.add(25);
//
//        // Print TreeSet
//        System.out.println("TreeSet: " + ts);
//
//        // Sabse Chhota Aur Bada Element
//        System.out.println("Smallest: " + ts.first());
//        System.out.println("Largest: " + ts.last());
//
//        // Lower, Floor, Ceiling, Higher
//        System.out.println("Lower than 25: " + ts.lower(25));
//        System.out.println("Floor of 25: " + ts.floor(25));
//        System.out.println("Ceiling of 20: " + ts.ceiling(20));
//        System.out.println("Higher than 10: " + ts.higher(10));
//
//        // Element Remove Karna
//        ts.remove(20);
//        System.out.println("After Removing 20: " + ts);
//
//        // Check Karna ki element hai ya nahi
//        System.out.println("Contains 10? " + ts.contains(10));
//
//        // TreeSet ka size check karna
//        System.out.println("Size of TreeSet: " + ts.size());
//
//        // Iterate Karna
//        System.out.println("TreeSet Elements:");
//        for (int num : ts) {
//            System.out.println(num);
//        }
//
//        // Reverse Order
//        System.out.println("Reverse Order: " + ts.descendingSet());
//
//        // TreeSet Ko Clear Karna
//        ts.clear();
//        System.out.println("After Clearing: " + ts);



//        add(element) ---->	TreeSet me element insert karta hai
//        remove(element) ---->	Element remove karta hai
//        contains(element) ---->	Check karta hai ki element present hai ya nahi
//        size() ---->	TreeSet ka size return karta hai
//        first() ---->	Sabse chhota element return karta hai
//        last()	----> Sabse bada element return karta hai
//        lower(x) ---->	x se chhota sabse bada element return karega
//        floor(x) ---->	x ya usse chhota sabse bada element return karega
//        ceiling(x) ---->	x ya usse bada sabse chhota element return karega
//        higher(x) ----->	x se bada sabse chhota element return karega
//        descendingSet()	 -----> Reverse order me TreeSet return karega
//        clear() ----->	TreeSet ko empty kar deta hai
//        isEmpty() ----->	Check karta hai ki TreeSet empty hai ya nah


//    ✅ Kab Use Kare TreeSet?
//    ✅ Jab elements ko sorted order me store karna ho
//    ✅ Jab duplicates avoid karna ho
//    ✅ Jab fast searching operations chahiye (O(log N))
    }
}
