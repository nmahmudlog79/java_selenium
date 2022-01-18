package volunteer_sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		String projectPath= System.getProperty("user.dir"); //FILE UPLOAD
		driver.findElement(By.id("uploadfile")).sendKeys(projectPath+"Files\\s1.png");
		
		//driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\Mahmud\\Desktop\\s1.png"); //From local

	}

}
