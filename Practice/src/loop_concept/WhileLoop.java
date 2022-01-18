package loop_concept;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 1; //initialization is done out side the loop 

		while (i <= 10) {
			System.out.println(i);
			i++;// if i don't use i++ it will print infinite time
		}
	}
}
