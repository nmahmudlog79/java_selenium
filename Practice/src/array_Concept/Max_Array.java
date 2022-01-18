package array_Concept;

	//Program to print the largest element in an array
	//https://www.javatpoint.com/java-program-to-print-the-largest-element-in-an-array--algoritham
public class Max_Array {

	public static void main(String[] args) {
		int [] num = {25, 10, 12, 65, -10};
		int max = num [0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				num [i] = max;
			}
		} System.out.println(max);
	}
}
