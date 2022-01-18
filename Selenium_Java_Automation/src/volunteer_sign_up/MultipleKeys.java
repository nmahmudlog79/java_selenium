package volunteer_sign_up;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.CONTROL+"a").build().perform(); //MULTPLE KEY

	}

}
