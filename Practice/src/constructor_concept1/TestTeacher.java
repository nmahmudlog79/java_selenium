package constructor_concept1;

public class TestTeacher {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mahmud", "Male", 40);
		t1.displayinfo();
		
		Teacher t2= new Teacher("Nurul", "Male", 50);
		t2.displayinfo();
		
		Teacher t3 = new Teacher("Hasan", "Male", 35);
		t3.displayinfo();

	}

}
