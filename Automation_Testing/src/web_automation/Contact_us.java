package web_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Contact_us {

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
	public void contactUs() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
		Thread.sleep(3000);

		// handling drop down
		WebElement dropElement = driver.findElement(By.xpath("//*[@id=\"id_contact\"]"));
		Select dropdown = new Select(dropElement);

		// 2. Extract all the options and print them
		List<WebElement> options = dropdown.getOptions();

		for (WebElement e : options) {
			System.out.println(e.getText());
		}

		// 3. select option from the drop down
		// dropdown.selectByVisibleText("Customer service");
		dropdown.selectByIndex(2);
		// dropdown.selectByValue("Radio-1");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"id_order\"]")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Please deliver the product quickly as per comittement or cancel the product");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"submitMessage\"]/span")).click();
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
		System.out.println(text);
		System.out.println(text);
		System.out.println(text);
		System.out.println(text);
		System.out.println(text);
		System.out.println(text);
		System.out.println(text);
		System.out.println(text);
		System.out.println(text);
	}

	@AfterMethod
	public void quitUrl() {
		driver.close();
	}
}
