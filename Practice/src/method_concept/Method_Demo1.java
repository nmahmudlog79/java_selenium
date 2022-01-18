package method_concept;

//Whenever we want to perform any operation multiple times then we choose methods. 
//A method is a block of code which only runs when it is called.
//You can pass data, known as parameters, into a method.
//Methods are used to perform certain actions, and they are also known as functions.
//Why use methods? To reuse code: define the code once, and use it many times.
//A method must be declared within a class. It is defined with the name of the method, followed by parentheses (). 
//There are two types of methods in Java: Predefined Method User-defined Method
//static means that the method belongs to the MyClass class and not an object of the MyClass class.
//Method Signature: Every method has a method signature. It is a part of the method declaration. It includes the method name and parameter list.

public class Method_Demo1 {

	public static void main(String[] args) {
		myMethod();
		myMethod();
		myMethod();
	}
	
	private static void myMethod() {
		System.out.println("Method is a block of code");
	}
}
