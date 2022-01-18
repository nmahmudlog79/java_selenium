package volunteer_sign_up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {
	//What is the difference between getWindowHandle() and getWinowHandles() in Selenium WebDriver?
	//getWindowHandle() is used to get the window handle of the window, that is currently in focus
	//1. Return type is String
	//2. Window Handle stores the unique address of the browser window
	//getWindowHandles() is used to get the widow handles of all the current opened windows
	//Return type is Set<String>
	public static void main(String[] args) {
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		//String handleValue= driver.getWindowHandle();
		//System.out.println(handleValue); //CDwindow-D4033A23D52C723EE384D8F01C2004BF
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		Set<String> handleValue = driver.getWindowHandles();
		
		for (String h : handleValue) {
			//System.out.println(h);
			String title = driver.switchTo().window(h).getTitle();
			//System.out.println(title);
			
			//if (title.equals("Salinalium | Home") || (title.equals("Salinalium | Home"));
			//if (title.equals("Salinalium | Home")) {
				//driver.close();
			//}
			
			if (title.equals("Salinalium | Home")) {
				driver.findElement(By.xpath("//*[@id=\"container\"]/header/div/div/div[2]/u1/li[4]/a")).click();
			}
		}

	}

}
