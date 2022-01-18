package volunteer_sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		
		//Admin--->Usermanagement--->Users
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		//Table
		int rows = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr")).size();
		System.out.println(rows);
		
		int count = 0;
		for(int r = 1; r<=rows; r++) {
		String status = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+r+"]/td[5]")).getText();
			
			if (status.equals("Enabled")) {
				count++;
			}
		}
		System.out.println("Number of enabled employees : "+count);
		System.out.println("Number of disabled employees :"+(rows-count));
		
		driver.quit();

	}

}
