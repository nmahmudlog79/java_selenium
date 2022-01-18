package string_problem;

public class ReverseString {

	public static void main(String[] args) {
		String s = "SOFTWARE";
		int len = s.length();
		String rev = "";
		
		for(int i = len-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		StringBuffer s1 = new StringBuffer("NURUL");
		StringBuffer reverse = s1.reverse();
		System.out.println(reverse);
	}

}
