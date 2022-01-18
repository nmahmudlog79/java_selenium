package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1) Open Web Browser(Chrome/IE/firefox).
2) Open URL  https://opensource-demo.orangehrmlive.com/
3) Enter username  (Admin).
4) Enter password  (admin123).   
5) Click on Login.
6) Capture title of the home page.
7) Verify title of the page: OrangeHRM 
8) Close browser
 **/
public class LoginTest_OrangeHRM {

	public static void main(String[] args) {
		
		//1) Open web browser(chrome)
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32");
		WebDriver driver = new ChromeDriver();// Launch the chrome driver
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
