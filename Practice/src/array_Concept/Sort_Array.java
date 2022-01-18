package array_Concept;

import java.util.Arrays;

public class Sort_Array {
	
	public static void main(String[] args) {
		int [] num = {10, -5, 2, 13, 0};
		Arrays.sort(num);
		System.out.println("Ascending :");
		for (int i = 0; i < num.length; i++) {
			System.out.println(" "+ num[i]);
		}
		System.out.println("\nDescending :");
		for (int i = num.length-1; i >=0; i--) {
			System.out.println(num[i]);
		}
	}

}
