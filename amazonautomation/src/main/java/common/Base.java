package common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base {

	public static WebDriver driver; // because accessing from other package it needs to make public

	// @BeforeMethod
	public void openBrowser() {
		setUpBrowser("chrome", "https://www.amazon.com/");
	}

	@Parameters({ "browserName", "url" })
	@BeforeMethod
	public void setUpBrowser(String browserName, String url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			String chromeDriverPath = "C://Drivers//chromedriver_win32//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			String fireFoxDriverPath = "C://Drivers//geckodriver-v0.23.0-win64//geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterMethod
	public void closeBrowser() throws IOException {
		takeScreenShotOnFail();
		driver.close();
		if (driver != null) {
			driver.quit();
		}
	}

	public void takeScreenShotOnFail() throws IOException {
		String path = "screenshot/auto";
		String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(path + "_" + timestamp + ".jpg"), true);
	}

	public void waitUntilClickable(String locator) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		WebElement element = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		element.click();
	}

	public void clickOnWebElementUsingWebElement(WebElement element) {
		element.click();
	}

	public void typeOnElement(String locator, String value) {
		try {
			driver.findElement(By.cssSelector(locator)).sendKeys(value);
		} catch (Exception e) {
			try {
				driver.findElement(By.xpath(locator)).sendKeys(value);
			} catch (Exception e2) {
				driver.findElement(By.id(locator)).sendKeys(value);
			}
		}
	}
	
	public void typeOnElementUsingWebElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void selectByVisibleTextFromSelect(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);

	}

	public void waitFor(int sec) throws InterruptedException {
		Thread.sleep(1000 * sec);
	}
	
	//Useful for @FindBy Approach
	public void typeOnElement1(WebElement locator, String value) {
		try {
			locator.sendKeys(value);
		} catch (Exception e) {
			locator.sendKeys(value);
		}
	}
	//useful for @FindBy Approach
	public void clearField(String locator) {
		driver.findElement(By.id(locator)).clear();
	}
	
	public void clearFieldUsingWebElement(WebElement element) {
		element.clear();
	}
	
	public void navigateBack() {
		driver.navigate().back();
	}

}
