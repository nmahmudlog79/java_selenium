package volunteer_sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTextFromTextBox {
	//Clear the text inside the text box fields 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(5);
		driver.findElement(By.id("textbox1")).clear();
		

	}

}
