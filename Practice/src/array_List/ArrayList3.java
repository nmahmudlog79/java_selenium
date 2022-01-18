package array_List;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		ar1.add(40);
		ar1.add(50);
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}

	}

}
