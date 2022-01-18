package string_problem;

public class CountFrequencyCharacter {

	public static void main(String[] args) {
		String s = "welcome to interview";
		int count =0;
		
		for (int i =0; i<= s.length()-1; i++) {
			if (s.charAt(i) =='t') {
			count++;	
			}
		}
		System.out.println(count);

	}

}
