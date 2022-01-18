package array_Concept;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("A");
		aList.add("B");
		aList.add("B");
		aList.add("C");
		String [] arr = new String[aList.size()];
		aList.toArray(arr);
			for (String string : arr) {
			System.out.println(string);
		}

	}

}
