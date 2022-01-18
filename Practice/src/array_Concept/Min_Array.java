package array_Concept;

	////Program to print the smallest element in an array
public class Min_Array {

	public static void main(String[] args) {
		int [] num = {10, 23, 567, 0, 1};
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min ) {
				min = num[i];
			}
		}System.out.println(min);
	}
}
