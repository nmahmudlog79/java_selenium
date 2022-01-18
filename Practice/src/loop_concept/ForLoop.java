package loop_concept;

public class ForLoop {

	public static void main(String[] args) {
	
		System.out.println("1st loop executed :");
		int i;
		for(i=0; i<=10; i++ ) {
			System.out.print(i);
			System.out.print(" ,");
		}
		
		System.out.println("\n2nd loop executed :");
		for(i=100; i>=0; i=i-10) {
			System.out.print(i);
			System.out.print(" ,");
		}

	}

}
