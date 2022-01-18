package array_Concept;

import java.util.Arrays;

////Java Program to find Third, 2nd and Smallest Number in an Array
public class Third_Smallest {

		public static void main(String[] args) {
			
			int [] arr = {12, 1, 45, 45, 56, 200, 100};
			
			int min = Integer.MAX_VALUE;
			int secondMin = Integer.MAX_VALUE;
			int thirdMin = Integer.MAX_VALUE;
			
			for (int i = 0; i < arr.length; i++) {
				
				if (arr[i] < min) {
					thirdMin = secondMin;
					secondMin = min;
					min = arr[i];
					
				} else if (arr[i] < secondMin) {
					thirdMin = secondMin;
					secondMin = arr[i];
					
				} else if (arr[i] < thirdMin) {
					thirdMin = arr[i];
				}
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("The min number is :"+min);
			System.out.println("The 2nd min number is :"+secondMin);
			System.out.println("The 3rd min number is :"+thirdMin);

	}

}
