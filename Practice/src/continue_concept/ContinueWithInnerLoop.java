package continue_concept;

public class ContinueWithInnerLoop {
	//Continue statement with inner loop
	//It continues inner loop only if you use the continue statement inside the inner loop.
	public static void main(String[] args) {

		for (int i = 0; i <= 3; i++) {

			for (int j = 0; j <= 3; j++) {
				if (i == 2 && j == 2) {
					i++;
					continue;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
