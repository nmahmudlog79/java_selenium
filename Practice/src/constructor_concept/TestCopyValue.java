package constructor_concept;

public class TestCopyValue {

	public static void main(String[] args) {

		// parameterized constructor call
		CopyValueFromObject obj1 = new CopyValueFromObject(10, "Mahmud");

		// print values of object properties.
		System.out.println("obj1 id = " + obj1.id);
		System.out.println("obj1 name = " + obj1.name);
		// Constructor call to copy the value of one object into other.
		CopyValueFromObject obj2 = new CopyValueFromObject(obj1);
		// print values of object properties.
		System.out.println("obj2 id = " + obj2.id);
		System.out.println("obj2 name= " + obj2.name);

	}

}
