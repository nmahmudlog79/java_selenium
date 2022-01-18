package method_concept;

public class MethodParameters {
	
	public static void myMethod(String fname, String lname) {
		System.out.println(fname +" "+lname);
	}
	public static void main(String[] args) {
		myMethod("Nurul", "Mahmud");
		myMethod("Hasan", "Ali");
		myMethod("FNU", "Mamun");
	}
}
