package stepDefinition;

//import cucumber.api.java.en.Then;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static pages.ProductCategoryPage.*;

public class ProductCategoryPage {

    @Then("^User should be able to view the product category page2$") // ambiguous def with loggedinpage
    public void user_should_be_able_to_view_the_product_category_page() {
        String actualProductCategory = visiblity_productCategory();
        assertEquals("Formal Shoes", actualProductCategory);
    }

}
