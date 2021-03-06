package com.zerobank.stepdefinitions;

import com.zerobank.pages.HomePage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginDefinitions {



    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }
    @Given("user enters valid credentials")
    public void user_enters_valid_credentials() {
        new HomePage().validSignIn();


    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        String url = new HomePage().getUrl();
        
        

        Assert.assertTrue("Verify that user is on home page",url.contains("index"));
    }

    @Given("user enters invalid credentials")
    public void user_enters_invalid_credentials() {
       new HomePage().invlaidSignIn();
    }
    @Then("user should see {string} message")
    public void user_should_see_message(String string) {
        String warningMessageText = new HomePage().loginWarningMessage.getText();


        Assert.assertEquals("Verify that user see the warning message",string,warningMessageText);
    }

}
