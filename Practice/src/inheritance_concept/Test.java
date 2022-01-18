package inheritance_concept;

public class Test {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		t1.name = "Nurul Mahmud";
		t1.gender = "Male";
		t1.age = 30;
		t1.qualification = "QE";
		t1.displayinfo2();
		
		
		Teacher t2 = new Teacher();
		t2.name = "Nurul Mashud";
		t2.gender = "Male";
		t2.age = 30;
		t2.qualification = "DEV";
		t2.displayinfo2();

	}

}
