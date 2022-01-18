package volunteer_sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_PopUps {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();//closes pop up by OK button
//		driver.switchTo().alert().dismiss();//closes pop up by CANCEL button
//		driver.switchTo().alert().getText();//To capture the alert message
//		driver.switchTo().alert().sendKeys("Text");//To send some data to alert box
			
	}

}
