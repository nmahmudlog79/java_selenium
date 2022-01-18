package constructor_concept1;

public class Teacher {
	
	String name, gender;
	int age;
	
	public Teacher() {
		System.out.println("No value for default constructor");
	}
	
	public Teacher(String n, String g, int a) {
		name = n;
		gender = g;
		age = a;
	}
	
	public void displayinfo() {
		System.out.println("Name "+name);
		System.out.println("Gender "+gender);
		System.out.println("Age "+age);
	}

}
