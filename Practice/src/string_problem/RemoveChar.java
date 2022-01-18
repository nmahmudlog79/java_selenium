package string_problem;

public class RemoveChar {

	public static void main(String[] args) {
		String s = "I love Java";
		System.out.println(charRemoveAt(s,2));
	}
	private static String charRemoveAt(String s, int i) {
		return s.substring(0, i)+s.substring(i+1);
	}

}
