package web_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

		//scenario: sign-in the web page and add a item in the cart and go to payment options
public class AddItemAndMakePayment {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe/");
		driver = new ChromeDriver();

		// 1. go to url
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void cartVerify() throws InterruptedException {

		// 2. click on sign in button
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(3000);

		// 3. enter user name & password
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nurul.mahmud@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Mahmud@2020");
		
		//4. click on sign in button
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		Thread.sleep(1000);

		//5. go to women section
		WebElement women = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));

		//6. choose t-shirt
		WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));

		Actions actions = new Actions(driver);
		actions.moveToElement(women).moveToElement(tshirt).click().build().perform();

		//7. select size of the T-shirt
		WebElement selectElement = driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_2']"));
		selectElement.isSelected();
		selectElement.click();
		selectElement.isSelected();

		//8. select style of the T-shirt-casual
		WebElement selectElement2 = driver.findElement(By.xpath("//input[@id='layered_id_feature_11']"));
		selectElement2.click();
		Thread.sleep(3000);

		//9. Click on "Add to Cart"
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")).click();

		//10. Click on "proceed to checkout"
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		Thread.sleep(3000);

		//11. click on cart
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
		
		//12. click on cart-check-out
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
		Thread.sleep(4000);

		//13. verify the number of item added text
		String itemsAdded = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]"))
				.getText();
		System.out.println("No. of Items Added in the Cart :" + itemsAdded);

		//14. again click on proceed to checkout
		driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]")).click();
		Thread.sleep(2000);
				
//		//15. write message in the box
//		driver.findElement(
//				By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/textarea[1]"))
//				.sendKeys("Please deliver the product quickly as per commitment or cancel the product");
//		Thread.sleep(2000);
		
		//16. click on proceed to check out
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
		Thread.sleep(1000);
		
		//17. click on agreement check-box
		WebElement selectElement3= driver.findElement(By.xpath("//label[contains(text(),'I agree to the terms of service and will adhere to')]"));
		Thread.sleep(1000);
		
		//18. again click on proceed to checkout
		driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]"))
				.click();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void closeUrl() {
		driver.close();
	}

}
