package list_concept;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
		//List iterator interface is used to traverse the element in a backward and forward direction
public class ListIteratorInterface {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		ListIterator<String> itr = list.listIterator();
		System.out.println("Traversing the element in forward direction");
		
		while (itr.hasNext()) {
			String string = (String) itr.next();
			
			System.out.println("Index :"+itr.nextIndex() + "Value :" +string);
		}
	}

}
