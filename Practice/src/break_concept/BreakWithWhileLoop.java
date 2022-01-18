package break_concept;

public class BreakWithWhileLoop {

	// Java Break statement in while loop
	public static void main(String[] args) {

		int i = 1;

		while (i <= 8) {
			if (i == 5) {
				i++;
				break;
			}
			System.out.println(i);// see while loop in details
			i++;
		}
	}
}
