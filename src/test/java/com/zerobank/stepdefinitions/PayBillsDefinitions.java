package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PayBillsDefinitions {

    PayBillsPage payBillsPage=new PayBillsPage();

    @Given("user completes the form succesfully")
    public void user_completes_the_form_succesfully() {
        payBillsPage.succesForm("5","13022022");

    }

    @Then("verify that {string} message is displayed")
    public void verify_that_message_is_displayed(String string) {

        Assert.assertTrue("Verify the succesfull message displayed",payBillsPage.warningMessage.isDisplayed());
        Assert.assertTrue("Verify the text of the message is as expected",payBillsPage.getWarningMessage().equals(string));

    }

    @Given("user tries to complete payment without inserting amount")
    public void user_tries_to_complete_payment_without_inserting_amount() {
        payBillsPage.succesForm("","13022022");
    }


    @Then("warning message {string} message is popped up for {string}")
    public void warning_message_message_is_popped_up_for(String message, String type) {
        String actualText = Driver.get().findElement(By.name(type)).getAttribute("validationMessage");

        System.out.println("actualText = " + actualText);

        BrowserUtils.waitFor(3);

        Assert.assertTrue("Verify the pop up alert message",actualText.equals(message));

    }



    @Given("user tries to complete payment without inserting date")
    public void user_tries_to_complete_payment_without_inserting_date() {
        payBillsPage.dateInputBox.clear();
        payBillsPage.succesForm("5","");

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
