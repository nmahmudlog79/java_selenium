package volunteer_sign_up;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

		public static WebDriver driver;
		
	public static void main(String[] args) {
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://goo.gl/RVdKM9");
		
		String year = "2021";
		String month = "December";
		String date = "03";
		
		driver.findElement(By.xpath("//*[@id=\"q20\"]/img")).click();// click on date picker element
		
		selectCurrentDate();
		//selectFutureDate();
		//selectPastDate();

	}
		
	static void selectCurrentDate(){
		Calendar cal = Calendar.getInstance();
		
		int d = cal.get(Calendar.DATE); // return the current date in int format
		String date = String.valueOf(d); //convert into string 
		driver.findElement(By.linkText("date")).click(); //link text method only accept string 
	}
	
	static void selectFutureDate() {
		
		
		
	}
	

}
