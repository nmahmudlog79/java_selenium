package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondTestCase {
	
	@BeforeClass
	void login() {
	System.out.println("This is login");	
	}
	
	@AfterClass
	void logout() {
		System.out.println("This is logout");
	}
	
	@Test(priority = 1)
	void search() {
		System.out.println("This is search");
	}
	@Test(priority = 2)
	void advsearch() {
		System.out.println("This is advsearch");
	}
	@Test(priority = 3)
	void recharge() {
		System.out.println("This is recharge");
	}

}
