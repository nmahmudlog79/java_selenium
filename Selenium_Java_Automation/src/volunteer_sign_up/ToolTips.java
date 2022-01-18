package volunteer_sign_up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTips {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		
		

	}

}
