package volunteer_sign_up;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadVariableByJavaScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		
		JavascriptExecutor jsc= (JavascriptExecutor) driver;
		String title= (String) jsc.executeScript("return document.title");//Read JavaScript Variable
		System.out.println(title);
		driver.quit();

	}

}
