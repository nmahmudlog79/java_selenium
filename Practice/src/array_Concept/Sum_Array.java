package array_Concept;

		//Java Program to print the sum of all the items of the array
public class Sum_Array {

	public static void main(String[] args) {
		int [] num = {12, 13, 100, 23, 0, 25};
		int sum =0;
		for (int i = 0; i < num.length; i++) {	
			sum = sum + num[i];
		}
		System.out.println(sum);	
	}
}
