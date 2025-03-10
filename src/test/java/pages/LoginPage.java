package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver{

    //public static WebDriver driver;
    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link_xpath = "Sign ";

    public static String username_text_xpath ="//*[@id=\"usr\"]";
    public static String password_text_xpath ="//*[@id=\"pwd\"]";
    public static String login_btn_xpath ="//*[@id=\"second_form\"]/input";
    public static String registration_btn_xpath = "NewRegistration";

    public static void sendkeys_username()
    {
        driver.findElement(By.xpath(username_text_xpath)).sendKeys("Scott.gale@gmail.com");
    }

    public static void sendkeys_password()
    {
        driver.findElement(By.xpath(password_text_xpath)).sendKeys("P@sword!");
    }

    public static void click_login_btn()
    {
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }

    public static void click_new_registration_btn()
    {
        driver.findElement(By.id(registration_btn_xpath)).click();
    }
}
