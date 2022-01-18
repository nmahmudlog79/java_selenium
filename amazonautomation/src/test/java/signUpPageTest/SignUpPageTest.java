package signUpPageTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.Base;
import pages.SignUpPage;

public class SignUpPageTest extends Base {
	
	SignUpPage signUpPage;
	
	@BeforeMethod
	public void getInit() {
		signUpPage = PageFactory.initElements(driver, SignUpPage.class);
	}
	
	@Test
	public void testSignUp() throws InterruptedException {
		signUpPage.clickOnAccountAndLists();
		waitFor(5);
		signUpPage.enterEmailForSignIn();
	}
	
	

}
