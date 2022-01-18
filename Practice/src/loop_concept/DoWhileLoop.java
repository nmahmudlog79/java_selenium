package loop_concept;

public class DoWhileLoop {
	// The Java do-while loop is executed at least once because condition is checked
	// after loop body.
	// It is called exit control loop.
	// What is the main difference between do-while loop?
	// execute the statement at least one time if the condition is false.
	public static void main(String[] args) {
		int i = 1;

		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}
}
