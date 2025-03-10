package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {

    public static WebDriver driver;

    public static ChromeOptions options;

    // constructor
    public BrowserDriver(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        //this.driver = driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver(); //initialize chrome driver
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
    }

    public void close(){
        this.driver.close();
    }
}
