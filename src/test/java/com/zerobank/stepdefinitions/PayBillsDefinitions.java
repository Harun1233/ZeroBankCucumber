package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PayBillsDefinitions {

    PayBillsPage payBillsPage=new PayBillsPage();

    @Given("user completes the form succesfully")
    public void user_completes_the_form_succesfully() {
        payBillsPage.succesForm();

    }

    @Then("verify that {string} message is displayed")
    public void verify_that_message_is_displayed(String string) {

        Assert.assertTrue("Verify the succesfull message displayed",payBillsPage.warningMessage.isDisplayed());
        Assert.assertTrue("Verify the text of the message is as expected",payBillsPage.getWarningMessage().equals(string));

    }

    @Given("user tries to complete payment without inserting amount")
    public void user_tries_to_complete_payment_without_inserting_amount() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("warning message {string} message is popped up")
    public void warning_message_message_is_popped_up(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("user tries to complete payment without inserting date")
    public void user_tries_to_complete_payment_without_inserting_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @Given("user completes the payment form by inserting invalid characters into amount input box")
    public void user_completes_the_payment_form_by_inserting_invalid_characters_into_amount_input_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that {string} warning message is not displayed")
    public void verify_that_warning_message_is_not_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("user complete the payment form by inserting alphabetical characters into date input box")
    public void user_complete_the_payment_form_by_inserting_alphabetical_characters_into_date_input_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
