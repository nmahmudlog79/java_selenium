package string_problem;

public class CubeOfNumber {

	public static void main(String[] args) {
		String s = "321";
		for (int i = 0; i < s.length(); i++) {
			int num = Character.getNumericValue(s.charAt(i));
			System.out.println(num * num * num);
		}

	}

}
