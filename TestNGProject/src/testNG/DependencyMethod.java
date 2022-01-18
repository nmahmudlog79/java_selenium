package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {
	
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
	
	@Test(priority = 3, dependsOnMethods = {"login"})
	void search() {
		System.out.println("search test");
		Assert.assertTrue(false);
	}
	
	@Test(priority = 4, dependsOnMethods = {"login", "search"})
	void advanceSreach() {
		System.out.println("advance search");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 5)
	void logout() {
		System.out.println("logout test");
		Assert.assertTrue(true);
	}

}
