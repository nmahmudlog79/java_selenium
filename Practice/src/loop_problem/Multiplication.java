package loop_problem;

import java.util.Scanner;

public class Multiplication {
	
	public void multiplication(int num) {
		for (int i = 0; i <= 10; i++) {
			System.out.print(" "+num*i);
		}
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		new Multiplication().multiplication(num);
		sc.close();
	}
}
