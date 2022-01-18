package volunteer_sign_up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowsers {
	//Doesn't have a user interface (UI less)
	//Headless browser programs operate like any other browser, but do not display any UI.
	//Selenium executes its' tests in the background
	//Chrome, Firefox, HTMLUnit driver, PhantomJS
	public static void main(String[] args) {
		
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http//tutorialsninja.com/demo/");
		
		System.out.println("Title of the page :"+driver.getTitle());

	}

}
