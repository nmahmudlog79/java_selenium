package american_express;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Travel_Card {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe/");
		driver = new ChromeDriver();
		
		driver.get("https://card.americanexpress.com/d/cm/american-express/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void selectTravelCard() throws InterruptedException {
		driver.findElement(By.xpath("//body/div[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[1]/nav[1]/div[1]/ul[2]/li[2]/div[1]/div[1]/a[2]")).click();
		Thread.sleep(1000);
		
		WebElement selectElement = driver.findElement(By.xpath("//body/div[1]/section[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]"));
		selectElement.isSelected();
		selectElement.click();
		selectElement.isSelected();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[1]/section[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[5]/div[1]/a[2]")).click();
	
		String actual_text = driver.findElement(By.xpath("//*[@id=\"responsiveWrapper_sub\"]/main/div/div[1]/div[2]/div[1]/div[2]/aside/div/div[2]/section/h4/div/text()")).getText();
		System.out.println(actual_text);
//		String expected_text = "American Express® Gold Card";
//		Assert.assertEquals(actual_text, expected_text, "Test Failed");
		Thread.sleep(3000);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
