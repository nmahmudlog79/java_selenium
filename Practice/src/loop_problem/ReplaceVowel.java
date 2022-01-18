package loop_problem;

//Write a method that uses a while loop. This method would replace every vowel in the String with X. Call your method from the main method.
public class ReplaceVowel {

	public String replaceVowel(String str) {
		String replacedString = "";
		int i = 0;

		while (i < str.length()) {
			if (str.charAt(i) == ('a') || str.charAt(i) == ('e') || str.charAt(i) == ('i') || str.charAt(i) == ('o')
					|| str.charAt(i) == ('u')) {
				replacedString += 'x';
			} else {
				replacedString += str.charAt(i);
			}
			i++;
		}
		return replacedString;
	}
	
	public static void main(String[] args) {
		String s = "Java is fun";
		ReplaceVowel obj = new ReplaceVowel();
		System.out.println(obj.replaceVowel(s));
	}
}
