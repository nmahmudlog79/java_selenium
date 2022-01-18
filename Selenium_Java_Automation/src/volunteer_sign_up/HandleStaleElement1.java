package volunteer_sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaleElement1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("nurul");
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys("nurul123");
		
		driver.navigate().refresh();
		
		try {
			username.sendKeys("nurul");
		} catch (StaleElementReferenceException e) {
			username = driver.findElement(By.name("username"));
			username.sendKeys("nurul");
		}

	}

}
