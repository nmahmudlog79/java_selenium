package volunteer_sign_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		actions.contextClick(button).build().perform();//RIGHT CLICK ON BUTTON
		
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
		
		Thread.sleep(5000);
		
		Alert alert =  driver.switchTo().alert();
		System.out.println("Test present on alert window is :"+alert.getText());
		alert.accept();
		
		
		

	}

}
