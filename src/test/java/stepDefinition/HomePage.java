package stepDefinition;

import io.cucumber.java.en.Given;
import static pages.HomePage.*;

public class HomePage {

    @Given("^User navigates to the login page$")
        public void user_navigates_to_the_Login_page() throws Throwable{
            click_hamburger_menu();
            click_signIn_Link();
            System.out.println("Step definition for scenario user nav to login page run");
    }
}

