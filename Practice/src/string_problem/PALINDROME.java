package string_problem;

public class PALINDROME {

	public static void main(String[] args) {
		String s1 = "madam";
		StringBuffer sb = new StringBuffer(s1);
		String s2 = sb.reverse().toString();//sb is string buffer is not equal to string
		if (s1.equals(s2)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrom");
		}
	}
}
