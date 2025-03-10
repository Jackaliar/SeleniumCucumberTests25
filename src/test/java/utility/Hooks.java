package utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static BrowserDriver driver;
    public static ChromeOptions options;

    // run before and after test run
    @Before
    public void setUp(){
        driver = new BrowserDriver(); // calls browserdriver class to initilize driver and open url
    }

    @After
    public void tearDown(){
        driver.close();
        //driver.quit();
    }
}
