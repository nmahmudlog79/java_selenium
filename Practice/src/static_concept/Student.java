package static_concept;

public class Student {
	
	String studentName;
	int age;
	static String collegeName = "Queens College";
	
	public Student(String s, int a) {
		studentName = s;
		age =a;
	}
	
	public void display() {
		System.out.println("Student Name :"+ studentName);
		System.out.println("Age is :"+age);
		System.out.println("College Name :"+collegeName);
	}

}
