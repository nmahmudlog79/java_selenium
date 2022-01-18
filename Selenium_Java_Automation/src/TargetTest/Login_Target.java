package TargetTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Target {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.target.com/");
		
		driver.findElement(By.xpath("//a[@href='#accountMenu']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@id='accountNav-signIn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("nurul.mahmud@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mahmud2020");
		
		Thread.sleep(3000);
		
		//to perform Scroll on application using Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)", "");
		
		//driver.findElement(By.xpath("//button[@id='login']")).click();
		driver.findElement(By.cssSelector("#login")).click();
		
		

	}

}
