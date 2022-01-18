package array_List;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		
		 ArrayList<String> cars = new ArrayList<String>();
		 cars.add("Volvo");
		 cars.add("BMW");
		 cars.add("Ford");
		 cars.add("Mazda");
		 System.out.println("Before sorting :");
		 for (String string : cars) {
			System.out.println(string);
		}
		 System.out.println("\nAfter sorting :");
		 Collections.sort(cars);
		 for (String string : cars) {
			System.out.println(string);
		}
	}
}
