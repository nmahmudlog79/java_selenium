package loop_problem;

import java.util.Scanner;

//Write a method that accepts two numbers and returns the average of Two. 
public class AverageTwoNum {
	
	public float avgTwoNumber(float num1, float num2) {
		float avg = (num1+num2)/2.0f;
		return avg;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your first number :");
		float num1 = scanner.nextFloat();
		System.out.print("Enter your second number :");
		float num2 = scanner.nextFloat();
		float average = new AverageTwoNum().avgTwoNumber(num1, num2);
		System.out.println(average);
		scanner.close();
	}
}
