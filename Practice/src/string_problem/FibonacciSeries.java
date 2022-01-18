package string_problem;

import java.util.Scanner;
//0 1 1 2 3 5 8 13 21
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers :");
		int num = sc.nextInt();
		int first =0;
		int second = 1;
		int fibo;
		System.out.print(first+" "+second);
		for (int i = 3; i <=num; i++) {
			fibo = first+second;
			System.out.print(" "+fibo);
			first = second;
			second = fibo;
		}
	}
}
