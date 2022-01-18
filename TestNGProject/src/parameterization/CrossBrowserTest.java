package parameterization;

import java.sql.SQLSyntaxErrorException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	WebDriver driver;
	
	@Parameters("browser")
	@Test(priority = 1)
	public void launchBrowser(String browser) throws InterruptedException {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C://Drivers//geckodriver-v0.23.0-win64//geckodriver.exe");
			driver = new FirefoxDriver();
		}else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C://Drivers//IEDriverServer_Win32_3.14.0//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void verifyTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority = 3)
	public void registration() {
		Assert.assertTrue(true);
		//write code for registration
	}
	
	@Test(priority = 4)
	public void closeBrowser() {
		driver.close();
	}

}
