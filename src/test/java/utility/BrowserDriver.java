package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {

    public static WebDriver driver;
    public static ChromeOptions options;

    // constructor
    public BrowserDriver(){
        //options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
        //System.setProperty("webdriver.http.factory", "jdk-http-client");
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");
        //driver = new ChromeDriver(); //initialize chrome driver
        //driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        //System.out.println("STARTING DRIVER From BrowserJava");
    }

    public void close(){
        this.driver.close();
    }
}
