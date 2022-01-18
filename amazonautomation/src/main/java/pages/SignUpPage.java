package pages;

import static pageElements.SignUpPageElements.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.Base;

public class SignUpPage extends Base {
	
	@FindBy(xpath = accountAndListsWebElement)
	public WebElement accoountAndLists;
	
	public void clickOnAccountAndLists() {
		//accoountAndLists.click();
		clickOnWebElementUsingWebElement(accoountAndLists);
	}
	
	public void enterEmailForSignIn() {
		typeOnElement(enterEmailAddressToSignInWebElement, "nurul.mahmud@gmail.com");
	}
} 
