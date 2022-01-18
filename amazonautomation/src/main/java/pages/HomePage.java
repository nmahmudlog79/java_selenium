package pages;
import pageElements.HomePageElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import common.Base;
import static pageElements.HomePageElements.*;

public class HomePage extends Base {

	@FindBy(xpath = HomePageElements.searchBoxWebElement)
	public WebElement searchBox;
	@FindBy(xpath = HomePageElements.searchButtonWebElement)
	public WebElement searchButton;
	@FindBy(xpath = HomePageElements.searchResultWebElement)
	public WebElement searchResults;
	@FindBy(xpath = HomePageElements.eligibleForFreeShippingCheckBoxWebElement)
	public WebElement eligibleForFreeShippingCheckBox;
	@FindBy(xpath = climatePledgeFriendlyCheckBoxWebElement)
	public WebElement climatePledgeFriendlyCheckBox;
	@FindBy(xpath = purellAdvancedHandSanitizerWebElement)
	public WebElement purellAdvancedHandSanitizer;
	@FindBy(xpath = selectQtyWebElement)
	public WebElement selectQty;

	// Action Method
	public void enterSearchKeyword(String productName) {
		// driver.findElement(By.xpath(HomePageElements.searchBoxWebElement)).sendKeys("Hand
		// Sanitizer");
		// driver.findElement(By.xpath(HomePageElements.searchBoxWebElement)).sendKeys(productName);
		searchBox.sendKeys(productName);
	}

	public void clickOnSearchBox() {
		// driver.findElement(By.xpath(HomePageElements.searchButtonWebElement)).click();
		searchButton.click();
	}

	public void clickOneligibleForFreeShippingCheckBoxWebElement() {
		// driver.findElement(By.xpath(HomePageElements.searchButtonWebElement)).click();
		eligibleForFreeShippingCheckBox.click();
	}

	public void clickOnClimatePledgeFriendlyCheckBox() {
		climatePledgeFriendlyCheckBox.click();
	}

	public void clickOnPurellAdvancedHandSanitizer() {
		purellAdvancedHandSanitizer.click();
	}

	public void selectQtyForPurell(String qty) {
		// Select qtySelect=new Select(selectQty);
		// qtySelect.selectByVisibleText("3");
		selectByVisibleTextFromSelect(selectQty, qty);
	}

	// Assertion Method
	public void verifySearchKeyWord(String expectedKeyWord) {
		// String actualSearchKeyWord =
		// driver.findElement(By.xpath(HomePageElements.searchResultWebElement)).getText();
		String actualSearchKeyWord = searchResults.getText();
		System.out.println("Actual Text :" + actualSearchKeyWord);
		Assert.assertEquals(actualSearchKeyWord, expectedKeyWord, "Search keyword not match");
	}

}
