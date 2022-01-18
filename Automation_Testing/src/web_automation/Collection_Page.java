package web_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Collection_Page {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe/");
		driver = new ChromeDriver();
		
		driver.get("https://dailysale.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void gotoCart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/section/header/div/div/div[2]/div[3]/a/div/div/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"upside-ucd-cart-container\"]/div/div[3]/a[3]/h3")).click();
		
		String actual_title = driver.findElement(By.xpath("//*[@id=\"shopify-section-collection-template\"]/section/div[1]/div[2]/div[2]/div/div/header/div/div/div[1]/div/h1")).getText();
		String expected_title = "Jewelry";
		System.out.println("Actual Title :"+actual_title);
		System.out.println("Expected Title :"+expected_title);
		Assert.assertEquals(actual_title, expected_title);
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
