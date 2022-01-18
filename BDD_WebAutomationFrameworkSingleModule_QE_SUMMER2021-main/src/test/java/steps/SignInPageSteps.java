package steps;

import configuration.common.WebBase;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.SignInPage;

import java.net.MalformedURLException;


public class SignInPageSteps extends WebBase {

    static SignInPage signInPage;

    @BeforeStep
    public static void getInit() {
        signInPage = PageFactory.initElements(driver, SignInPage.class);
    }


    @Given("user on amazon Sign-In page")
    public void user_on_amazon_sign_in_page() throws MalformedURLException {
        signInPage.clickOnHelloSignIn();
    }

    @Given("user enter valid {string} email address or phone number in username field")
    public void user_enter_valid_email_address_or_phone_number_in_username_field(String name) {
        signInPage.enterEmailAndPhoneNumber(name);
    }

    @Given("user click on continue button")
    public void user_click_on_continue_button() {
        signInPage.clickOnContinueButtonFromSignInPage();
    }

    @Given("user enter valid password in password Field")
    public void user_enter_valid_password_in_password_field() throws InterruptedException {
        signInPage.enterPasswordFromSignInPage();
        waitFor(10);
    }

    @When("user click on Sign-In button")
    public void user_click_on_sign_in_button() throws InterruptedException {
        signInPage.clickOnSignInButtonFromSignInPage();
        waitFor(10);
    }


    @When("user should be able to see the valid {string} user name")
    public void user_should_be_able_to_see_the_valid_user_name(String name) {
        signInPage.verifyUserNameAfterSignIn(name);
    }

//    @And("user should be able to see the valid {string} user name")
//    public void userShouldBeAbleToSeeTheValidUserName(String name) {
//
//    }

    @Then("user should be able to log in their account")
    public void user_should_be_able_to_log_in_their_account() {

    }

    @Then("user should be able to see welcome message on top of Account & list")
    public void user_should_be_able_to_see_welcome_message_on_top_of_account_list() {

    }


}
