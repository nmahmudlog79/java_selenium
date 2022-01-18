package string_problem;

public class WhiteSpace {

	public static void main(String[] args) {
		
		String a = "we are proud american";
		String b = a.replaceAll(" ", "");
		System.out.println(b);
		
		String s = "I am QA Tester";
		char [] ch = s.toCharArray();
		
		String str = "";
			for (int i = 0; i < ch.length; i++) {
			if (ch[i] !=' ') {
				str = str+ch[i];
			}
		}System.out.println(str);
	}
}
