package configuration.hooks;

import configuration.common.WebBase;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.net.MalformedURLException;

public class BddHooks  extends WebBase {


    @Before
    public void browserSetUp() throws MalformedURLException {
        OpenBrowser("https://www.amazon.com/");
    }


//Cucumber Hook:

    @AfterStep
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            // Take a Screenshot
            final byte[] screenShot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");
        }
    }


    @After
    public void cleanUp() throws IOException {
        closeBrowser();
    }

}
