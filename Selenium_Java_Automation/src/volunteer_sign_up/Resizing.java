package volunteer_sign_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizing {

	public static void main(String[] args) {
		
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		driver.switchTo().frame(0);// Switch to frame
		WebElement element = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).dragAndDropBy(element, 200, 150).build().perform();//RESIZING
		
		
	}

}
