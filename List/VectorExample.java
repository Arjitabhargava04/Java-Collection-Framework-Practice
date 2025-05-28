//---- Default Constructor----->
/*
import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();                    // default
        Vector<Integer> v2 = new Vector<>(20);                  // capacity 20
        Vector<Integer> v3 = new Vector<>(10, 5);               // capacity 10, increment by 5
        Vector<Integer> v4 = new Vector<>(Arrays.asList(1, 2, 3)); // from collection

        System.out.println(v4); // Output: [1, 2, 3]
    }
}
*/

// constructor with initial capacity

import java.util.*;

public class Main7{
	public static void main(String[] args){
		
		Vector<String> v = new Vector<>(3, 1);
		
		v.add("Apple");
		v.add("Mango");
		v.add("Banana");
		v.add("kjg");
	System.out.println(v);
	System.out.println(v.size());
	System.out.println(v.capacity());
	System.out.println(v.contains("PineApple"));
	
	Vector<String> v= new Vector<>(Collection <? extends String> v);
		v.add("Apple");
		v.add("Mango");
		v.add("Banana");
		v.add("kjg");
	}
}
