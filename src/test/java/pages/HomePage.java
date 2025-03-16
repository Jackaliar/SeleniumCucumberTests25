package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver  {

    //public static WebDriver driver;

    // webelements object
    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";

    public static String signIn_link_xpath = "//*[@id=\"menu\"]/a[2]/li";

    // perform operations
    public static void click_hamburger_menu() throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        //driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_signIn_Link() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(signIn_link_xpath)).click();
        //System.out.println("Success!! User navigates to the login page via hambur menu");

    }



}
