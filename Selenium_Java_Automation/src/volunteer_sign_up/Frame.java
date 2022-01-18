package volunteer_sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click(); // frame 1
		driver.switchTo().defaultContent(); // go back to the page or focus on page
		
		driver.switchTo().frame("PackageFrame");
		driver.findElement(By.linkText("WebDriver")).click(); // Frame 2
		driver.switchTo().defaultContent(); // go back to the page /focus on the page
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("/html/body/div[1]/u1/li[5]")).click(); //3rd frame

	}

}
