package loop_problem;

import java.util.Scanner;
		//Write a method that accepts two numbers and returns the minimum of Two.
public class TwoNumberReturnMin {
	public int minTwo(int num1, int num2) {
		int min = num1;
		if (num1>num2) {
			min = num2;
		} else {
			min = num1;
		}return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number :");
		int num2 = sc.nextInt();
		int min = new TwoNumberReturnMin().minTwo(num1, num2);
		System.out.println("Min is "+min);
		sc.close();
	}
}
