package method_overload2;

	//Example of Method Overloading with Type Promotion if matching found
	//If there are matching type arguments in the method, type promotion is not performed.
public class Sum {
	
	public void sum(int i, int j) {
		System.out.println("int arg method invoked");
	}
	
	public void sum(long a, long b) {
		System.out.println("long arg method invoked");
	}
	
	public static void main(String[] args) {
		Sum sum = new Sum();
		sum.sum(10, 10); //now int arg sum() method gets invoked 
	}

}
