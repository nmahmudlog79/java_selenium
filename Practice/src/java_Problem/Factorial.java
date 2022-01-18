package java_Problem;

	//5! = !*2*3*4*5 = 120
	//5! = 5*4*3*2*1 = 120

public class Factorial {

	public static void main(String[] args) {
		
		int num = 5;
		long factorial = 1;
		
		for (int i = num; i>=1; i--) {
			factorial = factorial*i;			
		}
		System.out.println("Factorial of a number is :" + factorial);

	}

}
