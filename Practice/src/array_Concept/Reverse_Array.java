package array_Concept;

//Program to print the elements of an array in reverse order
//https://www.javatpoint.com/java-program-to-print-the-elements-of-an-array-in-reverse-order--Algoritham
public class Reverse_Array {

	public static void main(String[] args) {
		int [] num = {1, 2, 3, 4, 5};
		System.out.println("Original Array :");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("\nReverse Array :");
		for (int i = num.length-1; i >= 0; i--) {
			System.out.println(num[i]);
		}
	}
}
