package array_Concept;

import java.util.Arrays;

public class CheckArraysEqual {
	public static void main(String[] args) {
		int [] a1 = {1,2,3,4};
		int [] a2 = {1,2,3,4};
		boolean status = Arrays.equals(a1, a2);
			if (status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are NOT elqual");
		}
	}
}
