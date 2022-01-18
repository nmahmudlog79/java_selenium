package volunteer_sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		
		//Admin--->Usermanagement--->Users
		
		WebElement admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement usermng = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(admin).moveToElement(usermng).moveToElement(users).click().build().perform();

	}

}
