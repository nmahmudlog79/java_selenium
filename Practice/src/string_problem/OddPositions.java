package string_problem;

public class OddPositions {

	public static void main(String[] args) {
		String s1 = "Welcome to interview";
		for (int i = 0; i < s1.length()-1; i++) {
			if (i%2 !=0) {
			System.out.println(s1.charAt(i));
			}
		}
	}

}
