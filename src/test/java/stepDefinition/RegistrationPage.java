package stepDefinition;

//import cucumber.api.java.en.Then;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
import static pages.RegistrationPage.*;

public class RegistrationPage {

    @Then("^User should be able to view the Registration page$")
    public void user_should_be_able_to_view_the_registration_page() throws InterruptedException {
        //String actualRegistrtationPageheading = visiblity_registrationheading();
        visiblity_user_registration_page();
        //assertEquals(actualRegistrtationPageheading, "User Registration Page");
    }

}