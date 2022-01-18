package method_concept;

//A method is a block of code which only runs when it is called.
//Access Modifier, Return Data Type, Method Name, Input/Arguments/Parameters, Method Body
//You can pass data, known as parameters, into a method.
//Methods are used to perform certain actions, and they are also known as functions.
//Why use methods? To reuse code: define the code once, and use it many times.
//A method must be declared within a class. It is defined with the name of the method, followed by parentheses ().
//To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
//The most important method in Java is the main() method.
//Method Signature: Every method has a method signature. It is a part of the method declaration. It includes the method name and parameter list.
//https://www.javatpoint.com/method-in-java

public class Method_Concept1 {

	public static void main(String[] args) {
		mMethod();
	}

	private static void mMethod() {
		System.out.println("This is static methos");
	}

}
