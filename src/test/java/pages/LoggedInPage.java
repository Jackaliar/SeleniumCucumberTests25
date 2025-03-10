package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {

    public static String productcategory_formalshoes = "//*[text()='Formal Shoes']";
    public static String productcategory_sportshoes = "//*[text()='Sports']";
    public static String productcategory_sneakershoes = "//*[text()='Sneakers']";

    // Verifying text
    public static void visibility_productcategory_formalshoes()
    {
        String actualfs = driver.findElement(By.xpath(productcategory_formalshoes)).getText();
        assertEquals("Formal Shoes", actualfs);
    }

    public static void visibility_productcategory_sportshoes()
    {
        String actualss = driver.findElement(By.xpath(productcategory_sportshoes)).getText();
        assertEquals("Sports", actualss);
    }

    public static void visibility_productcategory_sneakershoes()
    {
        String actualsnk =driver.findElement(By.xpath(productcategory_sneakershoes)).getText();
        assertEquals("Sneakers", actualsnk);
    }

}
