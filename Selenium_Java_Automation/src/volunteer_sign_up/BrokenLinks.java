package volunteer_sign_up;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinks {
	
	//If we get 4xx or 5xx HTTP Status codes in the response from the Server, when we hit any URL, then they are broken links.
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement link : links) {
			String url = link.getAttribute("href"); //BROKEN LINK
			
			System.out.println("---------------------");
			System.out.println(url);
			if (url==null || url.isEmpty()) {
				System.out.println("URL is empty");
				continue;
			} 
			
		HttpURLConnection huc= (HttpURLConnection)(new URL(url).openConnection());
		huc.connect();
		
		if (huc.getResponseCode()>=400) {
			System.out.println(url+ "is broken ");
		} else {
			System.out.println(url+ "is valid");
		}}
		
		driver.quit();
	}

}
