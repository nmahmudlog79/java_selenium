package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableTestMethod {
	
	@Test(priority = 1)
	void openUrl() {
		System.out.println("URL OPENED");
		Assert.assertTrue(true);
	}
	@Test(priority = 2, dependsOnMethods = {"openUrl"})
	void login() {
		System.out.println("login test");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3, enabled = false) //This method will not run
	void search() {
		System.out.println("still in progress.....search test");
	}
	
	@Test(priority = 4, enabled = false) //this method will not run
	void advanceSreach() {
		System.out.println("still in progress-----advance search");
	}
	
	@Test(priority = 5)
	void logout() {
		System.out.println("logout test");
		Assert.assertTrue(true);
	}

}
