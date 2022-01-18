package string_problem;

//First letter of each word lower to upper case
public class LowerToUpper {

	public static void main(String[] args) {
		String actualString = "  i  am nurul mahmud    ";
		String replaceString = actualString.replaceAll("\\s{2}", " ").trim();
		System.out.println(replaceString);
		String[] words = replaceString.split(" ");
		for (String w : words) {
			System.out.println(w.substring(0, 1).toUpperCase() + w.substring(1, w.length()) + " ");
		}
	}
}
