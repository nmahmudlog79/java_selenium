package pack1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TC2 {
	
	@Test
	void m3() {
		System.out.println("This is m3 from TestCase2");
	}
	@Test
	void m4() {
		System.out.println("This is m4 from TestCase2");
	}
	@Test
	void m5() {
		System.out.println("This is m5 from TestCase2");
	}
	
	@AfterTest
	void nn() {
		System.out.println("This is nn");
	}

}
