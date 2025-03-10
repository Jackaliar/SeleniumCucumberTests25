package stepDefinition;

//import cucumber.api.java.en.When;
import io.cucumber.java.en.When;
import static pages.LoginPage.*;

public class LoginPage {

    @When("^User successfully enters the log in details$")
    public void user_successfully_enters_the_log_in_to_details(){
        sendkeys_username();
        sendkeys_password();
        click_login_btn();

    }

}
