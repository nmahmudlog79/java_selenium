package list_concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		String [] array = list.toArray(new String[list.size()]);
		System.out.println("Printing Array :"+Arrays.toString(array));
		System.out.println("Printing List :"+list);
		
	}

}
