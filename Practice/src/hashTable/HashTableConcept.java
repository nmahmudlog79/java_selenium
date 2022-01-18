package hashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
	
	//it is similar to hashmap but is synchronized
	//store the value on the basis of key-value
	//Java Hashtable class doesn't allow null key or value.
	//key-->object--hashcode--->value
	//When object is create, java provide a particular number for the object it is called Hashcode and it like 32 bit
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		
		h1.put(1, "A");
		h1.put(2, "B");
		h1.put(3, "C");
		
		//create a clone copy/shallow copy:
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		
		h2 = (Hashtable<Integer, String>)h1.clone();
		
		System.out.println("the values of h1 :"+h1);
		System.out.println("the value of h2 :"+h2);
		
		h1.clear();
		System.out.println("the values of h1 :"+h1);
		System.out.println("the value of h2 :"+h2);
		
		//contains value
		Hashtable st = new Hashtable();
		
		st.put(1, "Nurul");
		st.put(2, "Mahmud");
		st.put(3, "Hasan");
		
		if (st.containsValue("Nurul")) {
			System.out.println("Values found");
		}
		
		//print all values from hashtable using ---Enumeration---elements();
		Enumeration e= st.elements();
		System.out.println("print values from st");
		
		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			System.out.println(object);
		}
		
		//get all the values from hashtable using  --- entrySet() ---set of hashtable values
		
		System.out.println("\nprint value from st using entry set");
		Set s =st.entrySet();
		System.out.println(s);
		
	Hashtable st1 = new Hashtable();
		
		st1.put(1, "Nurul");
		st1.put(2, "Mahmud");
		st1.put(3, "Hasan");
		st1.put(3, "Hasan"); //it contains only unique values
		//no null key and value
		st1.put(4, null);// null pointer exception
		
		//check both the hashtables are equal or not
		if (st.equals(st1)) {
			System.out.println("both are equals");
		}
		
		//get the value from a key
		System.out.println(st1.get(1));
		
		//get the hashcode of a hashtable object
		System.out.println("the hash code value of st1 :" + st1.hashCode());
	}
	
}
