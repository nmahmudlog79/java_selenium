package volunteer_sign_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/SeleniumPractic/sample.html");
		
		//int rows = driver.findElements(By.tagName("tr")).size(); //for single table we should approach this way
		//System.out.println(rows);
		
		int rows = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size(); // for multiple table we should approach this way
		System.out.println(rows);
		
		int columns = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/th")).size();
		System.out.println(columns);
		
		System.out.println("Product"+"    "+"Article"+"    "+"Price");
		
		for(int r = 2; r<=rows; r++) {
			for(int c =1; c<=columns; c++) {
			String value = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]")).getText();
			//String value = driver.findElement(By.xpath("/html/body/table/tbody/tr["+r+"]/td["+c+"]")).getText();
			System.out.println(value);
			}
			System.out.println();
		}
	}

}
