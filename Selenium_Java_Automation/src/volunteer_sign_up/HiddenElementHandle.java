package volunteer_sign_up;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElementHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.findElement(By.id("hide-textbox")).click();// HIde button is clicked
		JavascriptExecutor jsc = (JavascriptExecutor) driver;
		jsc.executeScript("document.getElementById('displayed-text').value='Nurul Mahmud';");//HIDDEN ELEMENT

	}

}
