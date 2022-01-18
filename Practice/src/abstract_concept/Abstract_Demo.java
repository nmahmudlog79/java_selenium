package abstract_concept;

public class Abstract_Demo {
	
//	ABSTRACTION
//**********************
//A class that is declared using “abstract” keyword is known as abstract class. 
//It can have abstract methods(methods without body) as well as concrete methods (regular methods with body).
//A normal class(non-abstract class) cannot have abstract methods. 
//***An abstract class has no use until unless it is extended by some other class.
//If you declare an abstract method in a class then you must declare the class abstract as well. 
//you can’t have abstract method in a concrete class. 
//***An abstract class can not be instantiated, which means you are not allowed to create an object of it. 
//>>>Because these classes are incomplete, they have abstract methods that have no body 
//so if java allows you to create object of this class then if someone calls the abstract method using that object 
//then What would happen? There would be no actual implementation of the method to invoke<<<
//We can’t create object of Abstract Class but we can create reference variable of Abstract Class.
//An abstract class is like a template, so you have to extend it and build on it before you can use it.
//Using the abstract key words we can  create the abstract class and methods.
//Unimplemented methods created with abstract keywords. 
//abstract class doesn’t need to have an abstract method compulsory.
//>>>If a regular class/child class extends an abstract class, then the class must have to implement all the 
//abstract methods of abstract parent class or it has to be declared abstract as well<<<<
//****Abstraction is a process where you show only “relevant” data and “hide” unnecessary details
//of an object from the user****
//It must be overridden and It can have constructors and static methods also.
//It can have final methods which will force the subclass not to change the body of the method.
//>>>>You want to hide some data or you want to declare some interface or a platform where standard methods are
//available without any implementation. So want to define a process over there, a rules and regulation over there
//and all the child classes override those methods and define the business logics accordingly<<<

//Why we need an abstract class?
//Answer: Lets say we have a class Animal that has a method sound() and the subclasses(see inheritance) of it 
//like Dog, Lion, Horse, Cat etc. Since the animal sound differs from one animal to another, there is no point to 
//implement this method in parent class. This is because every child class must override this method to give its 
//own implementation details, like Lion class will say “Roar” in this method and Dog class will say “Woof”.sc

}
