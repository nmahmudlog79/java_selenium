package volunteer_sign_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		
		Actions actions = new Actions(driver);
		actions.doubleClick(button).build().perform(); //DOUBLE CLICK
		

	}

}
