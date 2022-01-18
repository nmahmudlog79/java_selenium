package pack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
	
	@Test
	void m1() {
		System.out.println("This is m1 from TestCase1");
	}
	
	@Test
	void m2() {
		System.out.println("This is m2 from Test Case2");
	}
	
	@BeforeTest
	void mm() {
		System.out.println("this is mm");
	}

}
