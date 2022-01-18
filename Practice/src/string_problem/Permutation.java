package string_problem;

public class Permutation {
	
	public static void main(String[] args) {
		checkOutPermutation("","BAC");
		checkOutPermutation("","ABC");
		
	}
	private static void checkOutPermutation(String prefix, String str) {
		if (str.length() == 0) {
			System.out.println(prefix);
		for (int i = 0; i < str.length(); i++) {
			String newName = prefix + str.charAt(i);
			String newAlphabetic = str.substring(0, i)+str.substring(i+i);
			checkOutPermutation(newName, newAlphabetic);
		}
		}
	}
}
