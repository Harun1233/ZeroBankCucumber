package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AccountSummaryPageDefinitions {
    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();

    @Given("navigate to Account summary page")
    public void navigate_to_Account_summary_page() {
       accountSummaryPage.navigateToOnlineBank();
       accountSummaryPage.accountSummaryButton.click();
    }

    @Then("verify that the page title is {string}")
    public void verify_that_the_page_title_is(String string) {
        String title = accountSummaryPage.getTitle();
        System.out.println("title = " + title);

        Assert.assertTrue("Verify the title",string.equals(title));

    }

    @Then("verify that following Cash Accounts are displayed")
    public void verify_that_following_Cash_Accounts_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that following Account are displayed under Credit Accounts")
    public void verify_that_following_Account_are_displayed_under_Credit_Accounts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that following Investment Accounts are displayed")
    public void verify_that_following_Investment_Accounts_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that following Credit Card are displayed under Credit Accounts")
    public void verify_that_following_Credit_Card_are_displayed_under_Credit_Accounts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that following Credit Accounts are displayed")
    public void verify_that_following_Credit_Accounts_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that following Balance are displayed under Credit Accounts")
    public void verify_that_following_Balance_are_displayed_under_Credit_Accounts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that following Loan Accounts are displayed")
    public void verify_that_following_Loan_Accounts_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that following  are displayed under Credit Accounts")
    public void verify_that_following_are_displayed_under_Credit_Accounts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






}
