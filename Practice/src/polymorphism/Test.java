package polymorphism;

public class Test {
	
	public static void main(String[] args) {
		
		Animal myAnimal = new Animal(); //create animal object
		Animal myAnimal2 = new Cow(); //create cow object
		Animal myAnimal3 = new Horse(); //create horse object
		
		myAnimal.animalSound();
		myAnimal2.animalSound();
		myAnimal3.animalSound();
	}
	
	
	

}
