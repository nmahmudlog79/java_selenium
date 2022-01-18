package array_List;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();
		
		System.out.println("ArrayList before removing :");
		aList.add("A");
		aList.add("B");
		aList.add("B");//add duplicate elements or it can contain duplicate value/index
		aList.add("C");
		aList.add("D");
		aList.add("E");
		
		//displaying the elements
		System.out.println(aList);
		System.out.println("The value of 2nd index :"+aList.get(2)); //To access an element in the ArrayList, use the get() method and refer to the index number:
		System.out.println("Size of the Array before removing :"+aList.size());
		
		System.out.println("\nArrayList after modify :");
		aList.add(2, "G");//add an element at 2nd position
		System.out.println(aList);
		
		System.out.println("\nArrayList after removing :");
		aList.remove(3);
		aList.remove("E");
		System.out.println(aList);
		System.out.println("Size of the Array after removing :"+aList.size());
		
		System.out.println("\nusing for loop");
		//to print all the values from ArrayList
		//1. For Loop
		//2. Iterator
		
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}

	}

}
