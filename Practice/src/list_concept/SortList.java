package list_concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		System.out.println("Before sort :");
		for (String string : list) {
			System.out.println(string);
		}System.out.println("\nAfter sort :");
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
	}
}
