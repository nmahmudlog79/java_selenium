package volunteer_sign_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		//we need to know source element and target element
		//From where I drag and where i drop it
		
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		WebElement source_el = driver.findElement(By.id("box6"));// Italy- source element
		WebElement target_el = driver.findElement(By.id("box106"));// Rome target element
		
		Actions actions = new Actions(driver);
		
		Thread.sleep(3000);
		
		actions.dragAndDrop(source_el, target_el).build().perform();
		
		driver.quit();
	}

}
