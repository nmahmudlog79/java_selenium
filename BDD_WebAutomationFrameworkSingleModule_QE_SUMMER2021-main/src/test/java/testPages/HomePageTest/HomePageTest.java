package testPages.HomePageTest;

import pages.HomePage;
import configuration.common.WebBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static configuration.utilities.DataDriven.getItemValue;
import static configuration.utilities.DataDriven.getItemsListFromDB;

public class HomePageTest extends WebBase {
    //-Test Class: To keep Test methods

    // HomePage homePage = new HomePage();
    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    // Test case/ Test method
//    @Test
//    public void testSearchBoxFunctionality() {
//        HomePage.enterSearchKeyword("Hand Sanitizer");
//        HomePage.clickOnSearchBox();
//        HomePage.verifySearchKeyword("\"Hand Sanitizer\"");
//    }

    @Test(enabled = false)
    public void testSearchBoxFunctionality() {
        homePage.enterSearchKeyword("Hand Sanitizer");
        homePage.clickOnSearchBox();
        homePage.verifySearchKeyword("\"Hand Sanitizer\"");
    }

    @Test(enabled = false)
    public void testSearchBoxFunctionality1() {
        homePage.enterSearchKeyword("Hand Sanitizer");
        homePage.clickOnSearchBox();
        homePage.verifySearchKeyword("\"Hand Sanitizer1\"");
    }

    @Test(enabled = false)
    public void testCheckoutFunctionality() throws InterruptedException {
        homePage.enterSearchKeyword("Hand Sanitizer");
        homePage.clickOnSearchBox();
        //homePage.verifySearchKeyword("\"Hand Sanitizer\"");
        Thread.sleep(5000);
        homePage.clickOnEligibleForFreeShippingCheckBox();
        homePage.clickOnClimatePledgeFriendlyCheckBox();
        homePage.clickOnPurellAdvancedHandSanitizer();
        homePage.selectQtyForPurell("4");
        waitFor(5);

    }


    // Data Driven Approach: using List
    // getItemValue
    @Test(enabled = false)
    public void testCheckoutFunctionality1() throws InterruptedException {
        for (int i = 0; i <getItemValue().size() ; i++) {
            //getItemValue().get(i);
            homePage.enterSearchKeyword(getItemValue().get(i));
            homePage.clickOnSearchBox();
            Thread.sleep(5000);
            homePage.verifySearchKeyword("\""+getItemValue().get(i)+"\"");
            //homePage.verifySearchKeyword("\"Hand Sanitizer1\"");
        }
    }

    // Data Driven Approach: using Database
    @Test(enabled = true)
    public void testCheckoutFunctionality2() throws Exception {
        for (int i = 0; i <getItemsListFromDB().size() ; i++) {
            //getItemValue().get(i);
            System.out.println("Size ==> "+getItemsListFromDB().size());
            homePage.enterSearchKeyword(getItemsListFromDB("AmazonItems","items").get(i));
            homePage.clickOnSearchBox();
            Thread.sleep(5000);
            homePage.verifySearchKeyword("\""+getItemsListFromDB("AmazonItems","items").get(i)+"\"");
            //homePage.verifySearchKeyword("\"Hand Sanitizer1\"");
        }
    }

    // Data Driven Approach: using Database
    @Test(enabled = true)
    public void testCheckoutFunctionality3() throws Exception {
        for (int i = 0; i <getItemsListFromDB().size() ; i++) {
            //getItemValue().get(i);
            System.out.println("Size ==> "+getItemsListFromDB().size());
            homePage.enterSearchKeyword(getItemsListFromDB("AmazonItems","items").get(i));
            homePage.clickOnSearchBox();
            Thread.sleep(5000);
            homePage.verifySearchKeyword("\""+getItemsListFromDB("AmazonItems","items").get(i)+"\"");
            //homePage.verifySearchKeyword("\"Hand Sanitizer1\"");
        }
    }

    // Data Driven Approach: using Database
    @Test(enabled = true)
    public void testCheckoutFunctionality4() throws Exception {
        for (int i = 0; i <getItemsListFromDB().size() ; i++) {
            //getItemValue().get(i);
            System.out.println("Size ==> "+getItemsListFromDB().size());
            homePage.enterSearchKeyword(getItemsListFromDB("AmazonItems","items").get(i));
            homePage.clickOnSearchBox();
            Thread.sleep(5000);
            homePage.verifySearchKeyword("\""+getItemsListFromDB("AmazonItems","items").get(i)+"\"");
            //homePage.verifySearchKeyword("\"Hand Sanitizer1\"");
        }
    }


}
