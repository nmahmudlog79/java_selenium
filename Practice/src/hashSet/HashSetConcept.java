package hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {
	
	public static void main(String[] args) {
		
		Set<String> hSet = new HashSet<String>(); hSet.add("Alpha");
		
		hSet.add("Alpha");
		hSet.add("Testing");
		hSet.add("Beta");
		hSet.add("Alpha");// duplicate values is not allow
		hSet.add(null);
		
		System.out.println(hSet);
		
		System.out.println(hSet.contains("Testing"));
		
		System.out.println("\nusing for each loop : ");
		for (String string : hSet) {
			System.out.println(string);
		}
		
		System.out.println("\nusing iterator : ");
		Iterator<String> itr = hSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		hSet.remove("Beta");
		System.out.println(hSet);
	}

}
