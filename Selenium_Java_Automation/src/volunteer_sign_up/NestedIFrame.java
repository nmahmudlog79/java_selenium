package volunteer_sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrame {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click(); // button
		
		WebElement outerframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe")); 
		driver.switchTo().frame(outerframe);
		
		WebElement innerfram = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerfram);
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Testing");
		
		driver.quit();

	}

}
