package org.example.Collections_8;

public class LinkedHashSet {
    public static void main(String[] args) {
//        LinkedHashSet in Java
//        LinkedHashSet Java ka ek collection class hai jo HashSet ki tarah unique elements store karta hai,
//        lekin yeh insertion order maintain karta hai. Matlab jo order mein elements insert kiye jaate hain,
//        wahi order maintain hota hai.


//          Key Points of LinkedHashSet

//          ✅ Duplicate elements allow nahi hoti hain.
//          ✅ Insertion order maintain hota hai.
//          ✅ Null values bhi store kar sakta hai.
//          ✅ Performance HashSet ke barabar ya thoda slow hota hai kyunki yeh order maintain karta hai.


//       1️⃣ LinkedHashSet create karna
//        LinkedHashSet<Type> set = new LinkedHashSet<>();
//        LinkedHashSet<String> set = new LinkedHashSet<>();

//        2️⃣ Elements add karna (add())
//        set.add("Apple");
//        set.add("Banana");
//        set.add("Mango");
//        set.add("Apple"); // Duplicate element add nahi hoga

//        3️⃣ Remove an element (remove())
//        set.remove("Banana");
//        "Banana" LinkedHashSet se remove ho jayega.

//        4️⃣ Check if element exists (contains())
//        boolean present = set.contains("Mango"); // true

//        5️⃣ Size check karna (size())
//        int size = set.size(); // Total elements count karega

//        6️⃣ Iterate karna (Loop lagana)
//        for (String fruit : set) {
//            System.out.println(fruit);
//        }
//        Insertion Order Maintain Rahega! ✅

//        7️⃣ Clear all elements (clear())
//        set.clear(); // Sab elements delete ho jayenge

//        8️⃣ Check if empty (isEmpty())
//        boolean empty = set.isEmpty(); // true agar empty ho


//        Difference:           HashSet vs    LinkedHashSet
//        Feature	             HashSet 🚀    	LinkedHashSet 🛠️
//        Duplicates Allowed?	  ❌ No	        ❌ No
//        Order Maintain?	      ❌ No	        ✅ Yes (Insertion Order)
//        Performance	          🔥 Fast	     🐢    Slightly Slower
//        BestUseCase	           Fast Lookup   	Maintain Ord


//        Conclusion
//        Agar order important nahi hai, toh HashSet use karo (zyada fast hai)
//        Agar insertion order maintain karna hai, toh LinkedHashSet use karo.





    }
}
