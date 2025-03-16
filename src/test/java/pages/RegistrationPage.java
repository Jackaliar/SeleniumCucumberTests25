package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;
import static org.junit.Assert.assertEquals;


public class RegistrationPage extends BrowserDriver {

    public static String registration_heading_xpath = "/html/body/center/h1";


    public static void visiblity_user_registration_page() throws InterruptedException {
        //Thread.sleep(3000);
        String getRegistration =  driver.findElement(By.xpath(registration_heading_xpath)).getText();
        assertEquals("User Registration Page", getRegistration);
        driver.quit();
        //driver.close();
        //return getRegistration;
    }



}
