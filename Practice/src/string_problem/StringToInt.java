package string_problem;

public class StringToInt {

	public static void main(String[] args) {
		String s = "100"; //1st way
		Integer i = Integer.valueOf(s);
		System.out.println(i);
		String s1 = "100";//2nd way
		int a = Integer.parseInt(s1);
		System.out.println(a);
	}
}
