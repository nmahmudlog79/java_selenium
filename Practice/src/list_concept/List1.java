package list_concept;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Mango");
		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		
		for (String string : list) {
			System.out.println(string);
		}
	}

}
