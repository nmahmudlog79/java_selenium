package target_automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe/");
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
					
		driver.findElement(By.xpath("//button[@id='login']")).click();
	}

}
