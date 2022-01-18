package inheritance_concept;

public class Teacher extends Person{
	
		//automatically its come when extends Person Class
		//String name, gender
		//int age
		//displayinfo()
	
	String qualification;
	
	public void displayinfo2() {
		//System.out.println("Name is :"+name);
		//System.out.println("Gender is :"+gender);
		//System.out.println("Age is: "+age);
		displayInfo();
		System.out.println("Qualification "+qualification);
	}
	
	
	
}
