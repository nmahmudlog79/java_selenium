package static_concept;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student("Nurul", 40);
		Student s2 = new Student("Mahmud", 30);
		
		//We can change the college of all objects by the single line of code
		//Student.collegeName = "Columbia";
		
		s1.display();
		s2.display();

	}

}
