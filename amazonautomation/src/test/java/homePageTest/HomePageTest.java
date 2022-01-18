package homePageTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.Base;
import pages.HomePage;

public class HomePageTest extends Base {
	
	//Test Class: To keep Test methods
	HomePage homePage;
	
	@BeforeMethod
	public void getInit() {
		homePage = PageFactory.initElements(driver, HomePage.class);
	}
	
	@Test
	public void testSearchBoxFunctionality() {
		homePage.enterSearchKeyword("Hand Sanitizer");
		homePage.clickOnSearchBox();
		homePage.verifySearchKeyWord("\"Hand Sanitizer\"");
		
	}
	
	@Test
	public void testCheckoutFunctionality() throws InterruptedException {
		homePage.enterSearchKeyword("Hand Sanitizer");
		homePage.clickOnSearchBox();
		//homePage.verifySearchKeyWord("\"Hand Sanitizer\"");
		Thread.sleep(3000);
		homePage.clickOneligibleForFreeShippingCheckBoxWebElement();
		homePage.clickOnClimatePledgeFriendlyCheckBox();
		homePage.clickOnPurellAdvancedHandSanitizer();
		homePage.selectQtyForPurell("5");
		waitFor(5);
		
	}

}
