package loop_problem;

//Write a method that uses a for loop to display numbers in descending order in the step of 5 starting from 100.
public class DisplayNumber {

	public static void main(String[] args) {
		DisplayNumber obj = new DisplayNumber();
		obj.backwardCounter();
	}
	public void backwardCounter() {
		for (int i = 100; i >= 0; i = i - 5) {
			System.out.println(i);
		}
	}

}
