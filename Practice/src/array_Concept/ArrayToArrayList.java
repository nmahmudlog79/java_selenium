package array_Concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		String [] arr = {"A", "B", "C", "D"};
		List l = Arrays.asList(arr);
		System.out.println(l);
		
		String [] aStrings = new String[] {"Java","Python", "Scala", "C#"};
		ArrayList<String> aList = new ArrayList<String>(Arrays.asList(aStrings));
		System.out.println(aList);
		
	}

}
