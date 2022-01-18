package web_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
		
	//scenario: verify the item added in the cart
public class Add_Item_To_Cart {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe/");
		driver = new ChromeDriver();
		
		//1. open browser
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void addItemInCart() throws InterruptedException {
		
		//2. click on sign in button
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
		
		//3 select women section
		WebElement women = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));	
		
		//4. choose t-shirt
		WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));	
		
		Actions actions = new Actions(driver);
		actions.moveToElement(women).moveToElement(tshirt).click().build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")).click();
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		Thread.sleep(4000);
		
		String actualAddItemCartText = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/h2/span[2]")).getText();
		String expectedAddItemCartText = "There is 1 item in your cart.";
		System.out.println("actualAddItemCartText :"+actualAddItemCartText);
		System.out.println("expectedAddItemCartText :"+expectedAddItemCartText);
		Assert.assertEquals(actualAddItemCartText,expectedAddItemCartText, "Text NOT matched");
		
//		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
//		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
//		Thread.sleep(3000);
	}
	
//	@Test (priority = 2)
//	public void checkCart() {
//		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
//	}
	
	@AfterMethod
	public void closeUrl() {
		driver.close();
	}

}
