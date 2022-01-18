package list_concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String [] arr = {"Spark", "SQL", "Java", "QA"};//Creating Array
		System.out.println("Printing Array :" +Arrays.toString(arr));
		//Converting Array to List
		List<String> list = new ArrayList<String>();
			for (String string : arr) {
			list.add(string);
		}System.out.println("Printing List :"+list);
	}

}
