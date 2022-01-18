package static_concept;

public class Static_Concept {
	
//									"static" keyword
//Static keyword is used for memory  management.
//It makes the program more efficient by savings memory. 
//Static keyword can be used with 
//1. Variables (also known as class variable)
//2. Methods (also known as class method)
//3. Blocks and
//4. Nested classes. 
//Static members belong to the class instead of a specific instance, 
//this means if you make a member static, you can access it without creating object. 
//Static variable is not related to the Object, its related to the Class. So, it’s also called Class variable.
//A Static method means that it can be accessed without creating an object of the class, unlike public.
//Static block is used for initializing the static variables.

//When and why we use static variable?
//Suppose we want to a store record of all employees of any company, in this case, employee id is unique 
//for every employee but company name is common for all. When we create a static variable as a company name
//then only once memory is allocated otherwise it allocates a memory space each time for every employee.

//Restriction:There are two main restrictions for the static method. They are:

//1. The static method can not use non static data member or call non-static method directly.
//2. this and super cannot be used in static context.

//Why a static block executes before the main method ?
//A class has to be loaded in main memory before we start using it. Static block is executed during class loading.
//This is the reason why a static block executes before the main method.
	
		//Difference between static and final keyword
		//static keyword always fixed the memory that means that it will be located only once in the program 
		//whereas final keyword always fixed the value that means it makes variable values constant.

		//Note: As for as real-time statement there concern every final variable should be declared the static 
		//but there is no compulsion that every static variable declared as final.

}
