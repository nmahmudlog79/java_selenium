package interface_concept;

public class interface_demo {
	
//	   INTERFACE
//Interface is similar to class which is collection of public static final variables (constants) and abstract methods.
//****How interface is similar to class ?
//Whenever we compile any Interface program it generate .class file. 
//That means the bytecode of an interface appears in a .class file.
//An Interface is a collection of Abstract Methods and its 100% abstract.
//Like abstract classes, interfaces cannot be used to create objects.
//****Why we use interface?
//1.It is used to achieve 100% abstraction.2.For achieve multiple inheritance in Java.
//****Properties: 
//Only method declaration---no method body (only method prototype).
//It is implicitly abstract. So we no need to use the abstract keyword when declaring an interface.
//Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
//Methods in an interface are implicitly public.
//All the data members of interface are implicitly public static final.
//*****How interface is different form class?
//You can not instantiate an interface.
//It does not contain any constructors.
//All methods in an interface are abstract.
//Interface can not contain instance fields. Interface only contains public static final variables.
//Interface is can not extended by a class; it is implemented by a class.
//Interface can extend multiple interfaces. It means interface support multiple inheritance.
//****When we use abstract and when Interface?
//If we do not know about any things about implementation just we have requirement specification then we should be go for Interface
//If we are talking about implementation but not completely (partially implemented) then we should be go for abstract
//Marked or Tagged Interface:
//An interface that have no member is known as marker or tagged interface. For example: Serializable, Cloneable, Remote etc.
//****Why interface have no constructor ?
//1.Because, constructor are used for eliminate the default values by user defined values, 
//but in case of interface all the data members are public static final 
//that means all are constant so no need to eliminate these values. 
//2.Other reason because constructor is like a method and it is concrete method and interface 
//does not have concrete method it have only abstract methods that's why interface have no constructor.

}
