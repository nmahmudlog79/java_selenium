package continue_concept;

public class ContinueWithForLoop {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i == 4) {
				continue;// it skips the value 4
			}
			System.out.println(i);
		}
	}
}
