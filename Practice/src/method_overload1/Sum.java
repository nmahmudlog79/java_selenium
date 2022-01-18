package method_overload1;

//Method Overloading and Type Promotion
//https://www.javatpoint.com/method-overloading-in-java
//One type is promoted to another implicitly if no matching datatype is found.
//As displayed in the above diagram, byte can be promoted to short, int, long, float or double. The short datatype can be promoted to int, long, float or double.
//The char datatype can be promoted to int,long,float or double and so on.

public class Sum {
	
	public void sum(int i, long j) {
		System.out.println(i+j);
	}
	
	public void sum(int i, int j, int k) {
		System.out.println(i+j+k);
	}
	
	public static void main(String[] args) {
		Sum s = new Sum();
		s.sum(10, 20);// now second int literal will be promoted to long
		s.sum(100, 200, 300);
	}
}
