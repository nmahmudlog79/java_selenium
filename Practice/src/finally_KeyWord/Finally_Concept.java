package finally_KeyWord;

	public class Finally_Concept{
		
	public static void main(String[] args) {
		//test1();
		//test2();
		//division();
		division2();
	}
	
	public static void test1() {
		try {
			System.out.println("inside the test 1 method");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("inside the catch block");
		}
		finally {
			System.out.println("inside the finally block");
		}
	}
	
	public static void test2() {
		try {
			System.out.println("\ninside the test 2 method");
		} finally {
			System.out.println("inside the test2 finally block");
		}
	}
	
	public static void division() {
		int i =10;
		try {
			System.out.println("\ninside the try block of division method");
			int k = i/0;
		} catch (ArithmeticException e) {
			System.out.println("inside catch block of division");
			System.out.println("divided by zero error");
		}
		finally {
			System.out.println("execute this code even after exception");
		}	
	}
		
	public static void division2() {
		int i =10;
		try {
			System.out.println("\ninside the try block of division 2 method");
			int k = i/0;
		} catch (NullPointerException e) {
			System.out.println("inside catch block of division 2");
			System.out.println("divided by zero error");
		}
		finally {
			System.out.println("execute this code even after exception");
		}
	}
}

		
	
