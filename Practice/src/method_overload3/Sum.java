package method_overload3;

	//If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.
public class Sum {

	public void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	public void sum(long a, int b) {
		System.out.println("b method invoked");
	}

	public static void main(String[] args) {
		Sum s = new Sum();
		// s.sum(10, 10);//now ambiguity----compile time error
	}

}
