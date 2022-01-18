package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	//@Test
	//@BeforeMethod, @AfterMethod
	//@BeforeClass, @AfterClass
	//@BeforeTest, @AfterTest	

public class AnnotationTestNG {
	
	@BeforeMethod
	void login() {
	System.out.println("This is login");	
	}
	
	@AfterMethod
	void logout() {
		System.out.println("This is logout");
	}
	
	@Test(priority = 1)
	void search() {
		System.out.println("This is search");
	}
	@Test(priority = 2)
	void advsearch() {
		System.out.println("This is adv search");
	}
	@Test(priority = 3)
	void recharge() {
		System.out.println("This is recharge");
	}
}
