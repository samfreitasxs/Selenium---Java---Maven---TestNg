package StepDefinition;

import io.cucumber.java.en.Given;
import static pages.SingInPage.*;
public class SingInPage {
    @Given("the user navigates to the login page")
    public void the_user_navigates_to_the_login_page(){
        sendKeys_username_login();
        sendyKeys_password_login();
        click_login_btn();
    }
}
