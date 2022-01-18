package list_concept;

import java.util.ArrayList;
import java.util.List;

public class Test_List_Book {

	public static void main(String[] args) {
		
		//creating list of book
		List<List_Book> list = new ArrayList<List_Book>();
		
		//creating books
		List_Book book1 = new List_Book(101, "Java", "Nurul Mahmud", "ABC", 8);
		List_Book book2 = new List_Book(102, "Spark", "Nurul", "XYZ", 9);
		List_Book book3 = new List_Book(103, "Hive", "Mahmud", "MNM", 10);
		
		//adding book to list
		list.add(book1);
		list.add(book2);
		list.add(book3);
		
		//Traversing list
		for (List_Book book : list) {
			System.out.println(book.id+"==>"+book.author+"==>"+book.publisher+"==>"+book.quantity);
		}
		
		
		

	}

}
