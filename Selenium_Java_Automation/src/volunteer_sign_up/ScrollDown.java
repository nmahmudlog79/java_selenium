package volunteer_sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//Create javascriptexecutor variable 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Approach 1: number of pixels
		//js.executeScript("window.scrollBy(0,4000)", "");
		
		//Approach--till we found the element
		//WebElement flag = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[35]/td[1]/img[1]"));
		//js.executeScript("arguments[0].scrollIntoView()", flag);
		
		//Approach 3: till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		

	}

}
