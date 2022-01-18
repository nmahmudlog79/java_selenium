package constructor_concept1;

public class Student1 {
	
	String name;
	int roll;
	
	public Student1(String n, int r) {
		name = n;
		roll = r;
	}
	
	public void display() {
		System.out.println(name+ " roll is "+roll);
	}
	
	public static void main(String[] args) {
		Student1 student1 = new Student1("Mahmud", 001);
		student1.display();
	}

}
