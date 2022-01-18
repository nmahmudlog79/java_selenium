package methodoverload4;

//Why Method Overloading is not possible by changing the return type of method only?
//In java, method overloading is not possible by changing the return type of the method only because of ambiguity. Let's see how ambiguity may occur:

public class Sum {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static double sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(Sum.sum(10, 10));// ambiguity
		// Here, how can java determine which sum() method should be called?
		// Note: Compile Time Error is better than Run Time Error.
		// So, java compiler renders compiler time error if you declare the same method
		// having same parameters.
	}

}
