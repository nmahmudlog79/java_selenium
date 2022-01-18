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

public class Create_Account {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe/");
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	@Test
	public void createAccount() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("nurul.mahmud@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		
		Thread.sleep(2000);
		
		//handle radio button 
		WebElement mrElement = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
		System.out.println(mrElement.isSelected());
		mrElement.click();
		System.out.println(mrElement.isSelected());
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Nurul");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Mahmud");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nurul.mahmud@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Mahmud123");
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Nurul");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Mahmud");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("271 Bell Ave");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Lodi");
		
		// handling drop down
				WebElement dropElement = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
				Select dropdown = new Select(dropElement);

				//3. select option from the drop down
				dropdown.selectByVisibleText("New Jersey");	
				//dropdown.selectByIndex(30);	
				
				Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("07644");
		
		WebElement dropElement1 = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
		Select dropdown1 = new Select(dropElement1);
		dropdown1.selectByIndex(1);	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("917361286");
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("271 Bell Ave");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		
		String text = driver.findElement(By.xpath("//p[contains(text(),'Welcome to your account. Here you can manage all o')]")).getText();
		System.out.println("Actual Text : "+text);
		System.out.println("Expected Text :"+"Welcome to your account. Here you can manage all of your personal information and orders.");
		}

	@AfterMethod
	public void exitBrowser() {
		driver.close();
	}

}
