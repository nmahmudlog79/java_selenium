package string_problem;

import java.util.Scanner;

public class VowelChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the char :");
		char ch = sc.next().charAt(0);
		
		if (ch == 'a') {
			System.out.println("Vowel");
		} else if (ch == 'e') {
			System.out.println("Vowel");
		} else if (ch == 'i') {
			System.out.println("Vowel");
		}else if (ch == 'o') {
			System.out.println("Vowel");
		}else if (ch == 'e') {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonent");
		}
	}
}
