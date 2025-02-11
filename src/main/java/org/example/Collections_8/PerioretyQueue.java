package org.example.Collections_8;

public class PerioretyQueue {
    public static void main(String[] args) {
//        PriorityQueue in Java
//        PriorityQueue ek special queue hoti hai jo priority-based ordering follow karti hai. By default, smallest
//        element sabse pehle aata hai (Min-Heap). Agar custom ordering chahiye toh Comparator use kar sakte hain.

//
//        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-Heap (Default)
//        pq.add(30);
//        pq.add(10);
//        pq.add(20);

//        Smallest element sabse pehle aata hai (Min-Heap behavior)

//        1.Element Insert Karna (add(), offer())
//        pq.add(5);     // Insert karta hai, Exception throw karega agar fail ho
//        pq.offer(25);  // Insert karta hai, fail hone par exception nahi deta
//        System.out.println(pq); // Output: [5, 10, 20, 30, 25] (Heap order)

//        2. Sabse Chhota Element Dekhna (peek())
//        System.out.println(pq.peek()); // Output: 5 (Smallest element)
//        Agar queue empty ho to null return karega.


//        3. Sabse Chhota Element Remove Karna (poll(), remove())
//        pq.poll();  // Sabse chhota element hata dega
//        System.out.println(pq); // Output: [10, 25, 20, 30]
//🔹      poll() agar queue empty ho to null return karega, jabki remove() exception throw karega.


//        4. Size Check Karna (size())
//        System.out.println("Size: " + pq.size()); // Output: Size: 4

//        5. Check Karna ki Element Hai Ya Nahi (contains())
//        if (pq.contains(20)) {
//            System.out.println("20 is present!");
//        } else {
//            System.out.println("20 is not present!");
//        }


//        6. PriorityQueue Ko Iterate Karna (for-each, Iterator)
//        for (int num : pq) {
//            System.out.println(num);
//        }

//        Iterator<Integer> it = pq.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

//       7. PriorityQueue Ko Clear Karna (clear())
//        pq.clear();
//        System.out.println(pq); // Output: []

//        if (pq.isEmpty()) {
//            System.out.println("Queue is empty");
//        }


//        Max-Heap (Descending Order)
//        By default, PriorityQueue min-heap hoti hai (smallest element pehle aata hai).
//        Agar Max-Heap chahiye toh Comparator use karein


//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//        maxHeap.add(30);
//        maxHeap.add(10);
//        maxHeap.add(20);

//        System.out.println(maxHeap.poll()); // Output: 30 (Largest element pehle niklega)


//        Method	         Use
//        add(element) ---->	Queue me element add karta hai
//        offer(element) ---->	Queue me element add karta hai (fail hone par exception nahi deta)
//        peek()  ----->	Sabse chhota element dekhta hai (remove nahi karta)
//        poll() ---->	Sabse chhota element remove karta hai (null return karega agar queue empty ho)
//        remove() ---->	Sabse chhota element remove karta hai (exception dega agar queue empty ho)
//        size() ----->	Queue ka size return karta hai
//        contains(element) ---->	Check karta hai ki element present hai ya nahi
//        clear() ----->	Queue ko empty kar deta hai

//          ✅ Kab Use Kare PriorityQueue?
//          ✅ Jab elements ko priority order me rakhna ho
//          ✅ Jab smallest/largest element ko efficiently access karna ho (O(1))
//          ✅ Jab Sorting se avoid karna ho aur quick retrieval chahiye
//
//
    }
}
