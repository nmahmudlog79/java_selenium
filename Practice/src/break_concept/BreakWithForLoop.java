package break_concept;

public class BreakWithForLoop {

	// Break leaves the loop completely and executes the statements after the loop
	// i.e. break completely exits the loop
	// In case of inner loop, it breaks only inner loop
	// We can use Java Break statement in all types of loops such as for loop, while loop and do-while loop
	//Also used in Switch statement

	public static void main(String[] args) {

		for (int i = 1; i <= 8; i++) {
			if (i == 5) {
				break;// break the loop
			}
			System.out.println(i);
		}
	}
}
