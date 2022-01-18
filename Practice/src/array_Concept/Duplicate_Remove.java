package array_Concept;

import java.util.Arrays;

	//How to remove the duplicate element from array?
public class Duplicate_Remove {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8,1,2,3,4,5,8,9};
		Arrays.sort(a);//1,1,2,2,3,3,4,4,5,5,6,7,8,9,9
		int result[] = new int[a.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[i+1]) 
				result[k++] = a[i];
			}
		result[k++] = a[a.length-1];
		for (int i=0; i < k; i++) {
			System.out.println(" "+result[i]);
		}
	}
}
