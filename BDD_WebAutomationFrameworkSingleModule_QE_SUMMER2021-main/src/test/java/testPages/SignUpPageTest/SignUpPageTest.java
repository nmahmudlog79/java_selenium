package testPages.SignUpPageTest;


import pages.SignUpPage;
import configuration.common.WebBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpPageTest extends WebBase {
    SignUpPage signUpPage;

    @BeforeMethod
    public void getInit() {
        signUpPage = PageFactory.initElements(driver, SignUpPage.class);
    }

    @Test
    public void testSignUp() throws InterruptedException {
        signUpPage.clickOnAccountAndLists();
        //Thread.sleep(5000);
        waitFor(5);
        signUpPage.enterEmailForSignIn();
    }



}
