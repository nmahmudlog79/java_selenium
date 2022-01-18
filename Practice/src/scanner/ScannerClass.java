package scanner;

import java.util.Scanner;

public class ScannerClass {

	// Scanner is one of the predefined class which is used for reading the data
	// dynamically from the keyboard.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Scanner(InputStream)
		// This constructor create an object of Scanner class by talking an object of
		// InputStream class.
		// An object of InputStream class is called in which is created as a static data
		// member in the System class.
		// sc--read the data from keyboard
		// System.in---provide the environment to read the data from key board
		System.out.println("Enter 1st Number :");
		int num1;
		num1 = sc.nextInt();
		System.out.println("Enter 2nd Number :");
		int num2;
		num2 = sc.nextInt();

		int sum = num1 + num2;

		System.out.println("sum is:" + sum);
	}

}
