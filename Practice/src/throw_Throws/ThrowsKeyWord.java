package throw_Throws;

	//used to handle the exception but we don't report anything
	//there is no option for report anything
	//The throws keyword is used to indicates what exception type may be thrown by a method.
	//The "throws" is used to throw an exception for a method
	//What is the need of having throws keyword when you can handle exception using try-catch?
	//We already know we can handle exceptions using try-catch block.
	//The throws does the same thing that try-catch does but there are some cases where you would
	//prefer throws over try-catch. For example: Lets say we have a method myMethod() that has statements
	//that can throw either ArithmeticException or NullPointerException, in this case you can use try-catch.
	//But suppose you have several such methods that can cause exceptions, in that case it would be tedious to
	//write these try-catch for each method. The code will become unnecessary long and will be less-readable.
	//One way to overcome this problem is by using throws like this: declare the exceptions in the method 
	//signature using throws and handle the exceptions where you are calling this method by using try-catch.

public class ThrowsKeyWord {
	
	
	public static void main(String[] args) throws ArithmeticException{
		ThrowsKeyWord obj = new ThrowsKeyWord();
		obj.sum();
	}
	
	public void sum() throws ArithmeticException {
		div();
	}
	
	public void div() throws ArithmeticException {
		int i = 9/0; //exception line
	}

}
