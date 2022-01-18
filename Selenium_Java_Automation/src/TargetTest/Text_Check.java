package TargetTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Check {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.target.com/");
		
		driver.findElement(By.xpath("//a[@href='#accountMenu']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@id='accountNav-signIn']")).click();
				
		String actual_title = driver.getTitle();
		String exp_title = "Sign into your Target account";
		
		if (actual_title.contains(exp_title)) {
			System.out.println("Actual Text Found");
		} else {
			System.out.println("Actual Text Not Found");
		}
		
		driver.close();
	}

}
