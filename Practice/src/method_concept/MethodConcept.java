package method_concept;

public class MethodConcept {
	
	public static int getSum(int i, int j) {
		int sum = i+j;
		return sum;
	}
	
	public static void sayHi() {
		System.out.println("2. Hi");
	}
	
	public static void main(String[] args) {
		System.out.println("1. Program Start");
		sayHi();
		int addition = getSum(10, 20);
		System.out.println("3. Result" + addition);
	}

}
