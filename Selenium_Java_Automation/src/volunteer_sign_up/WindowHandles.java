package volunteer_sign_up;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");//First default window will opened
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		String defaultWindow = driver.getWindowHandle();
		Set<String> allWindows= driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		itr.next();//first window handle
		String childWindow = itr.next();//second window handle
		driver.switchTo().window(childWindow);
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(defaultWindow);
		driver.close();

	}

}
