package array_List;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("QA");
		ar1.add("Dev");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Spark");
		ar2.add("SQL");
		ar2.add("Hive");
		
		System.out.println("After Add All :");
		ar1.addAll(ar2);
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		System.out.println("Size of the ArrayList :"+ar1.size());
		
		System.out.println("\nAfter remove All :");
		ar1.removeAll(ar2);
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		System.out.println("Size of the ArrayList :"+ar1.size());
		
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Java");
		ar3.add("SQL");
		ar3.add("Hive");
		
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Java");
		ar4.add("QA");
		ar4.add("Dev");
		
		System.out.println("\nAfter retain All :");//retail All means common
		ar3.retainAll(ar4);
		for (int i = 0; i < ar3.size(); i++) {
			System.out.println(ar3.get(i));
		}
		System.out.println("Size of the ArrayList :"+ar3.size());
		
	}

}
