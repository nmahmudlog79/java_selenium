package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<String> link = new LinkedList<String>();
		
		//add
		link.add("Test");
		link.add("QA");
		link.add("Selenium");
		link.add("Spark");
		link.add("Java");
		
		//print
		System.out.println("content of linked list :"+link);
		
		//add first
		link.addFirst("Mahmud");
		//add last
		link.addLast("Automation");
		
		System.out.println("content of linked list :"+link);
		//get
		System.out.println(link.get(0));
		
		//set
		link.set(0, "Hive");
		System.out.println(link.get(0));
		
		//remove first or last
		link.removeFirst();
		link.removeLast();
		System.out.println("content of linked list :"+link);
		
		//for loop
		for (int i = 0; i < link.size(); i++) {
			System.out.println(link.get(i));
		}
		
		System.out.println("\nadvanced for loop :");
		for (String string : link) {
			System.out.println(string);
		}
		
		System.out.println("\niterator :");
		Iterator<String> itr = link.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
		
		System.out.println("\nwhile :");
		
		int num =0;
		while (link.size()>num) {
			System.out.println(link.get(num));
			num++;
		}
	}
}
