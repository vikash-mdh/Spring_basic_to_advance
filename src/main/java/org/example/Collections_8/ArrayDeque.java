package org.example.Collections_8;

public class ArrayDeque {
    public static void main(String[] args) {
//        ArrayDeque Operations in Java  ---> ArrayDeque ek double-ended queue (Deque) hai jo Array-based
//        implementation deta hai. Iska use Stack aur Queue dono ki tarah kiya ja sakta hai.

//        note --> Ye Deque interface ko implement karta hai aur faster hota hai LinkedList se.


//        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Elements Add Karna
//        deque.add(10);
//        deque.add(20);
//        deque.add(30);
//        deque.addFirst(5);
//        deque.addLast(40);

//        // Print Deque
//        System.out.println("ArrayDeque: " + deque);

        // First Aur Last Element Dekhna
//        System.out.println("First: " + deque.getFirst());
//        System.out.println("Last: " + deque.getLast());

        // Element Remove Karna
//        deque.removeFirst();
//        deque.removeLast();
//        System.out.println("After Removing First & Last: " + deque);

        // Check Karna ki element hai ya nahi
//        System.out.println("Contains 20? " + deque.contains(20));

        // Deque ka size check karna
//        System.out.println("Size of Deque: " + deque.size());

        // Iterate Karna
//        System.out.println("Deque Elements:");
//        for (int num : deque) {
//            System.out.println(num);
//        }

        // List Ko Clear Karna
//        deque.clear();
//        System.out.println("After Clearing: " + deque)

// Summary        (Short Notes)
//       Method	              Use
//       add(element)	Queue ke end me element add karta hai
//       addFirst(element)	Front me element insert karta hai
//       addLast(element)	Last me element insert karta hai
//       removeFirst()	First element delete karta hai
//       removeLast()	Last element delete karta hai
//       pollFirst()	First element delete karta hai (Exception nahi deta)
//       pollLast()	Last element delete karta hai (Exception nahi deta)
//       getFirst()	First element return karta hai
//       getLast()	Last element return karta hai
//       peekFirst()	First element return karta hai (Exception nahi deta)
//       peekLast()	Last element return karta hai (Exception nahi deta)
//       size()	Deque ka size return karta hai
//       contains(element)	Check karta hai ki element present hai ya nahi
//       clear()	Deque ko empty kar deta hai
//       isEmpty()	Check karta hai ki Deque empty hai ya nahi


//        ✅ Kab Use Kare ArrayDeque?
//        ✅ Jab Stack ya Queue implement karna ho (Faster than LinkedList)
//        ✅ Jab elements ka addition/removal dono sides se zaroori ho
//        ✅ Jab PriorityQueue ka alternative chahiye (kyunki ArrayDeque faster hoti hai)

}
}
