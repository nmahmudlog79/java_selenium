package array_Concept;

	//Program to print the duplicate elements of an array
	//https://www.javatpoint.com/java-program-to-print-the-duplicate-elements-of-an-array--Algoritham

public class Duplicate_Element {
	
	public static void main(String[] args) {
		int [] num = {1, 2, 3, 4, 5, 2, 3, 6};
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] == num[j]) {
				System.out.println(num[j]);
				}
			}
		}
	}
}
