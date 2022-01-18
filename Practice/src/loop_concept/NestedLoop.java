package loop_concept;

public class NestedLoop {
	//If we have a for loop inside the another loop, it is known as nested loop.
	//The inner loop executes completely whenever outer loop executes
	public static void main(String[] args) {
		int i, j;

		for (i = 1; i <= 2; i++) {
			System.out.println("outer loop start");

			for (j = 1; j <= 3; j++) {
				System.out.println("inner loop running");
			}
		System.out.println("outer loop end");
		System.out.println("\n");
		}
	}
}
