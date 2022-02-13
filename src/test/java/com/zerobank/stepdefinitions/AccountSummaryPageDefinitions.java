package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryPageDefinitions {
    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();

    @Given("navigate to {string} page")
    public void navigate_to_page(String string) {
        accountSummaryPage.navigateToOnlineBank();
        accountSummaryPage.navigateToPages(string);
    }

    @Then("verify that the page title is {string}")
    public void verify_that_the_page_title_is(String string) {
        String title = accountSummaryPage.getTitle();


        Assert.assertTrue("Verify the title",string.equals(title));

    }

    @Then("verify that following given account types are displayed on the page")
    public void verify_that_following_given_account_types_are_displayed_on_the_page(List<String> pageAccountTypes) {
        String pageAccountTypeText = new AccountSummaryPage().pageAccountTypeText();



        for (String pageAccountType : pageAccountTypes) {

            Assert.assertTrue("Verify given account types are displayed on page",pageAccountTypeText.contains(pageAccountType));
        }

    }

    @Then("verify that following given account types are displayed under Credit Accounts column")
    public void verify_that_following_given_account_types_are_displayed_under_Credit_Accounts_column(List<String> creditAccountTypes) {

        String creditAcoountTypes = new AccountSummaryPage().getCreditAcoountTypes();


        for (String creditAccountType : creditAccountTypes) {

            Assert.assertTrue("Verify that given account types are displayed under Credit Account Types",creditAcoountTypes.contains(creditAccountType));

        }

    }








}
