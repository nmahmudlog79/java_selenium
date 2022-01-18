package volunteer_sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaleElement {

	public static void main(String[] args) throws InterruptedException {
		//Stale means old, delayed, no longer fresh
		//Stale element means an old element or no longer available element
		//Assume there is an element that is found on a web page referenced as a WebElement in WebDriver.
		//If the DOM changes then the WebElement goes stale. If we try to interact which is staled then the 
		//StaleElementReferenceException thrown
		//When this happens you will need to refresh your reference, or find the element again.
		
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.pavantestingtool.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement link = driver.findElement(By.xpath(""));
		link.click();
		driver.navigate().back();
		Thread.sleep(4000);
		try {
			link.click();
		} catch (StaleElementReferenceException e) {
			link = driver.findElement(By.xpath(""));
			link.click();
		}
	}
}
