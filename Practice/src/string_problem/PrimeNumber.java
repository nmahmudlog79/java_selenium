package string_problem;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive integer :");
		int num = sc.nextInt();
		int count =0;
		
		for (int i = 1; i < num; i++) {
			if (num%2==0) {
				count++;
				break;	
			}
		}
		if (count==0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}
	}
}
