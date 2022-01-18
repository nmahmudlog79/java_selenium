package testNG;

import org.testng.annotations.Test;

//First Test Case
	//1. Open URL
	//2. Login
	//3. Logout

public class FirstTestCase {
	
	//every method is consider as a test
	@Test(priority=1)
	void openURL() {
		
		//Web driver code for open URL'
		System.out.println("This is open URL");
	}
	
	@Test(priority = 2)
	void logIn() {
		//Web driver code for open URL'
		System.out.println("This is open Login");
	}
	
	@Test(priority = 3)
	void logOut() {
		//Web driver code for open URL'
		System.out.println("This is open Logout");
	}

}
