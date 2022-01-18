package array_Concept;

import java.util.Arrays;

//Java Program to find Third Largest, 2nd Largest and Largest Number in an Array
public class Third_Largest {

	public static void main(String[] args) {
		
		int [] arr = {12, 1, 45, 45, 100, 200, 100};
		
		int largest = 0;
		int secondLargest = 0;
		int thirdLargest = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[i];
				
			} else if (arr[i] > secondLargest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
				
			} else if (arr[i] > thirdLargest) {
				thirdLargest = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("The largest number is :"+largest);
		System.out.println("The 2nd largest number is :"+secondLargest);
		System.out.println("The 3rd largest number is :"+thirdLargest);
		
	}
}
