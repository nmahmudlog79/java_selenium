package pages;


import PageElements.HomePageElements;
import configuration.common.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static PageElements.HomePageElements.*;


public class HomePage extends WebBase {
    //ActionMethod Class: To keep Action Method and Assertion Method

    @FindBy(xpath = searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(xpath = HomePageElements.searchButtonWebElement)
    public WebElement searchButton;
    @FindBy(xpath = HomePageElements.searchResultWebElement)
    public WebElement searchResult;
    @FindBy(xpath = HomePageElements.eligibleForFreeShippingCheckBoxWebElement)
    public WebElement eligibleForFreeShippingCheckBox;
    @FindBy(xpath = HomePageElements.climatePledgeFriendlyCheckBoxWebElement)
    public WebElement climatePledgeFriendlyCheckBox;
    @FindBy(xpath = HomePageElements.purellAdvancedHandSanitizerWebElement)
    public WebElement purellAdvancedHandSanitizer;
    @FindBy(xpath = HomePageElements.selectQtyWebElement)
    public WebElement selectQty;


//    @FindBy(how = How.XPATH, using = HomePageElements.searchBoxWebElement)
//    public WebElement searchBox1;

    // Action Method
    public void enterSearchKeyword(String productName) {
        // driver.findElement(By.xpath(HomePageElements.searchBoxWebElement)).sendKeys("Hand Sanitizer");
        // driver.findElement(By.xpath(HomePageElements.searchBoxWebElement)).sendKeys(productName);
        searchBox.clear();
        searchBox.sendKeys(productName);
        // searchBox1.sendKeys(productName);
    }


    public void clickOnSearchBox() {
        //driver.findElement(By.xpath(HomePageElements.searchButtonWebElement)).click();
        searchButton.click();
    }
    public void clickOnEligibleForFreeShippingCheckBox() {
        eligibleForFreeShippingCheckBox.click();
    }
    public void clickOnClimatePledgeFriendlyCheckBox() {
        climatePledgeFriendlyCheckBox.click();
    }
    public void clickOnPurellAdvancedHandSanitizer() {
        purellAdvancedHandSanitizer.click();
    }

    public void selectQtyForPurell(String qty){
       // Select qtySelect=new Select(selectQty);
       // qtySelect.selectByVisibleText("3");
       // selectByVisibleTextFromSelect(selectQty,qty);

    }
    //  Assertion Method
    public void verifySearchKeyword(String expectedKeyWord) {
        //String actualSearchKeyword = driver.findElement(By.xpath(HomePageElements.searchResultWebElement)).getText();
        String actualSearchKeyword = searchResult.getText();
        System.out.println("Actual Text: "+actualSearchKeyword);
        Assert.assertEquals(actualSearchKeyword, expectedKeyWord, "Search keyword not match");
    }


}
