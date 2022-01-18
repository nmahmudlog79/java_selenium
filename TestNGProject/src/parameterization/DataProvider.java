package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvider {
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
	
	@Test(dataProvider = "users") //dataProvider is a parameter of @Test Annotation
	void loginTest(String username, String password) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	}
	
	@org.testng.annotations.DataProvider(name = "users") // @Dataprovider is an annotation
	String [] [] loginData(){
		String [] [] data = {{"ABC","ABC"},{"XYZ","XYZ"}, {"MON","MON"}};
		return data;
	}
	
	@AfterClass
	void closeBrowser() {
		driver.close();
	}

}
