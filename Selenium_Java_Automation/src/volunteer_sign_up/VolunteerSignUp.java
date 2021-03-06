package volunteer_sign_up;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VolunteerSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("web.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://goo.gl/RVdKM9"); // Opens the URL on the browsers
		driver.manage().window().maximize();
		
		String title = driver.getTitle();	//returns the title of the page
		System.out.println("Title of the Page :"+title);
		
		String url = driver.getCurrentUrl();	//returns the URL of the page
		System.out.println("URL of the Page :"+url);
		
		//String page = driver.getPageSource();	//return HTML code for page
		//System.out.println(page);
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Nurul"); //First Name
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("Mahmud"); //Last Name
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("9173611286"); //Cell 
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("USA");//Country
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("NJ");//City
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("abc@gmail.com");//email
		
		//Handling drop down/combo box/list box
		WebElement dropElement = driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']"));
		Select dropdown = new Select(dropElement);
		
		//1. Find how many options present in drop down
		System.out.println("No of options present in drop down :"+dropdown.getOptions().size());
		
		//2. Extract all the options and print them
		List <WebElement> options = dropdown.getOptions();
		
		for (WebElement e : options) {
			System.out.println(e.getText());			
		}
		
		//3. select option from the drop down
		//dropdown.selectByVisibleText("Morning");
		dropdown.selectByIndex(3);
		//dropdown.selectByValue("Radio-1");
		
		//Handling radio buttons/check box
		//Conditional command
		WebElement male = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		
		System.out.println(male.isDisplayed());	//check displayed or not 
		System.out.println(male.isEnabled());  //check enabled or not
		System.out.println(male.isSelected()); //check selected or not
		male.click();
		System.out.println(male.isSelected()); //check selected or not
		
		//Handling check box
		driver.findElement(By.xpath("//label[contains(text(),'Monday')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Friday')]")).click();
		
		//Handle Links
		driver.findElement(By.linkText("Software Testing Tutorials")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Software Testing Tools")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.close(); //closes current browsers only
		driver.quit(); //closes multiple browsers
	

	}

}
