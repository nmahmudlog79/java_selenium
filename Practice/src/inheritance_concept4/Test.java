package inheritance_concept4;
	
	//What happens if super class and subclass have same field name?
	//Super class field will be hidden in the sub class. You can access hidden super class field in sub class using super keyword.
public class Test {

	public static void main(String[] args) {
		B b = new B();
		b.display();
	}

}
