package web_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mens_Apparel {
		
		WebDriver driver;
		
		@BeforeMethod
		public void launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe/");
			driver = new ChromeDriver();
			
			driver.get("https://dailysale.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
		
		@Test
		public void menFashion() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/section/header/div/div/div[2]/div[2]/div/a[1]/span[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"login-customer[email]\"]")).sendKeys("nurul.mahmud@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"login-customer[password]\"]")).sendKeys("Mahmud@2020");
			driver.findElement(By.xpath("//*[@id=\"header_customer_login\"]/button")).click();
			
			Thread.sleep(1000);
//			driver.switchTo().alert().dismiss();
			
			WebElement fashion = driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/section/nav/div/div/ul/li[4]/a"));
			WebElement mens_app = driver.findElement(By.xpath("//*[@id=\"dropdown-desktop-menu-0-4-mega-menu-0\"]/div/div/div[1]/a"));
			Actions actions = new Actions(driver);
			actions.moveToElement(fashion).moveToElement(mens_app).click().build().perform();
			
			driver.switchTo().alert().dismiss();
			
			String actual_title = driver.findElement(By.xpath("//h1[contains(text(),\"Men's Apparel\")]")).getText();
			String expected_title = "Men's Apparel";
			System.out.println("Actual Title :"+actual_title);
			System.out.println("Expected Title :"+expected_title);
			Assert.assertEquals(actual_title, expected_title);
		}
		
		@AfterMethod
		public void exitBrowser() {
			driver.close();
		}
		
}
