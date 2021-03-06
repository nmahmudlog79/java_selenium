package orangeHRMTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*
1) Open Web Browser(Chrome/IE/firefox).
2) Open URL  https://opensource-demo.orangehrmlive.com/
3) Enter username  (Admin).
4) Enter password  (admin123).   
5) Click on Login.
6) Capture title of the home page.
7) Verify title of the page: OrangeHRM 
8) Close browser
*/

public class LogIn_Test_OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//WebElement username = driver.findElement(By.id("txtUsername"));
		//username.sendKeys("Admin");
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		//driver.findElement(By.name("Submit")).click();
		driver.findElement(By.cssSelector("input.button")).click();
		String actual_title = driver.getTitle();
		String exp_title = "OrangeHRM";
		
		if (actual_title.equals(actual_title)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		driver.close();
		driver.quit();
		
	}

}
