package web_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	//check availability of stock
public class Instock_Dresses {
	
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe/");
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void inStockDressItem() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("dresses");
		driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		
		// handling drop down
		WebElement dropElement = driver.findElement(By.xpath("//select[@id='selectProductSort']"));
		Select dropdown = new Select(dropElement);

		// 2. Extract all the options and print them
		List<WebElement> options = dropdown.getOptions();

		for (WebElement e : options) {
			System.out.println(e.getText());
		}

		// 3. select option from the drop down
		// dropdown.selectByVisibleText("Customer service");
		dropdown.selectByIndex(5);
		// dropdown.selectByValue("Radio-1");
		
		Thread.sleep(4000);
		
		String item_available = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]")).getText();
		System.out.println("No. of Dresses in Stock :"+item_available);
	}
	
	public void close() {
		driver.quit();
	}
}
