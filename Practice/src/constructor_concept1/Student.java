package constructor_concept1;

public class Student {
	
	String name;
	
	public Student(String n) {
		name = n;
	}
	
	public Student() {
		name = "Unknown";
	}
	
	void display() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Student s1 = new Student("Mahmud");
		Student s2 = new Student();
		s1.display();
		s2.display();
	}
}
