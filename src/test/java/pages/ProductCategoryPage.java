package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;

import static utility.BrowserDriver.driver;

public class ProductCategoryPage extends BrowserDriver {

    //public static WebDriver driver;

    public static String productcategory_heading_xpath = "//*[@id=\"ShoeType\"]";

    // check ele productcategory visibility
    public static String visiblity_productCategory(){
        String actualProductCategory = driver.findElement(By.xpath(productcategory_heading_xpath)).getText();

        return actualProductCategory;
    }

}
