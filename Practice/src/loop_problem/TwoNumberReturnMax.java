package loop_problem;

import java.util.Scanner;
		//Write a method that accepts two numbers are returns the maximum of Two.
public class TwoNumberReturnMax {
	
	public int maxTwo(int num1, int num2) {
		int max = num1;
		if (num1<num2) {
			max = num2;
		} else {
			max = num1;
		}return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number :");
		int num2 = sc.nextInt();
		int max = new TwoNumberReturnMax().maxTwo(num1, num2);
		System.out.println("Max is "+max);
		sc.close();
	}
}
