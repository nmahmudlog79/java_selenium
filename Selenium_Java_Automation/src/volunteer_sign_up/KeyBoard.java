package volunteer_sign_up;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();	
		
		Actions actions = new Actions(driver);//PRESS ENTER BY KEYBOARD
		actions.sendKeys(Keys.ENTER).build().perform();//PRESS ENTER BY KEYBOARD
				

	}

}
