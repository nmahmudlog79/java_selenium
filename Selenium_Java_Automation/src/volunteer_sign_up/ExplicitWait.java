package volunteer_sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		
		driver.get("http://newtours.demoaut.com/");
		
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username.sendKeys("mercury");
		
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		username.sendKeys("mercury123");
			
		
	}

}
