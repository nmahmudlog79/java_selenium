package list_concept;

import java.util.ArrayList;
import java.util.List;

public class ListGetSet {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		System.out.println("Accessing the element :"+list.get(1));
		//Changing the element
		list.set(3, "Lemon");
		
		for (String string : list) {
			System.out.println(string);
		}
	}

}
