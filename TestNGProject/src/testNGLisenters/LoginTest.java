package testNGLisenters;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	void setup() {
		Assert.assertTrue(false);
	}
	
	@Test
	void loginByEmail() {
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = {"setup"})// skipped
	void loginByFacebook() {
		Assert.assertTrue(true);
	}

}
