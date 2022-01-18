package pages;


import configuration.common.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static PageElements.SignUpPageElements.*;


public class SignUpPage extends WebBase {
    @FindBy(xpath =accountAndListsWebElement )
    public WebElement accountAndLists;
    @FindBy(css =accountAndListsWebElement1 )
    public WebElement accountAndLists1;

    public void clickOnAccountAndLists(){
    //   accountAndLists.click();
//        clickOnWebElementByXpath(accountAndLists);
      // clickOnElementUsingWebElement(accountAndLists);
        // using css selector
       clickOnElementUsingWebElement(accountAndLists1);
    }

    public void enterEmailForSignIn(){
        typeOnElement(enterEmailAddressToSignInWebElement,"mh.shahib@gmail.com");

    }

}
