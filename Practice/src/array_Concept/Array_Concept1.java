package array_Concept;

import java.util.Iterator;

public class Array_Concept1 {
	
	public static void main(String[] args) {
		
		//int i = 20; //duplicate variable is not allowed
		//int i =10;
		// i = 10 //at a time we can store only one variable
		
		int [] a = new int [5];//declare and instantiation
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 'A';
		System.out.println(a[2]);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("\n*****double*****");
		
		double [] d = new double[3];
		
		d[0] = 11.11;
		d[1] = 22.22;
		d[2] = 33.33;
		
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("\n****char****");
		
		char [] ch = new char[3];
		
		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("\n****String****");
		
		String [] strings = new String[3];
		
		strings[0] = "Nurul";
		strings[1] = "Mahmud";
		strings[2] = "Nurul Mahmud";
		
		System.out.println(strings.length);
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		System.out.println("\n****Object****");
		
		Object [] obj = new Object[6]; //Object array is used to store different types of value
		
		obj[0] = "Nurul";
		obj[1] = 123;
		obj[2] = "10.5f";
		obj[3] = 12.22;
		obj[4] = "01/01/2022";
		obj[5] = "A";
		
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
}
