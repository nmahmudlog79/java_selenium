package string_problem;

public class CountNumberLetters {

	public static void main(String[] args) {
		String s1 = "We love Java";
		int count = 0;
		System.out.println("Length of the sentence is :"+s1.length());
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				count++;
			}
		}System.out.println(count);

	}

}
