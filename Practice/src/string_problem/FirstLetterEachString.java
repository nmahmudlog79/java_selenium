package string_problem;

public class FirstLetterEachString {

	public static void main(String[] args) {
		String s1 = "Learn Java with me";
		String [] words = s1.split(" ");
		
		for(int i =0; i<words.length; i++) {
		String s=words[i];
		
		System.out.println(s.charAt(0));
		}
	}
}
