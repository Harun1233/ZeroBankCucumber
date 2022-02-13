package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountActivityPageDefinitions {

    AccountActivityPage accountActivityPage=new AccountActivityPage();
    @And("account dropdown should have {string} as a default option")
    public void account_dropdown_should_have_as_a_default_option(String string) {

        String defaultOption = accountActivityPage.getDefaultOption();

        Assert.assertTrue("Verify the default selected option", defaultOption.contains(string));
    }

    @Given("account dropdown should have given options")
    public void account_dropdown_should_have_given_options(List<String> list) {
        String allOptions = accountActivityPage.getAllOptions();

        for (String s : list) {

            Assert.assertTrue("Verify the all dropdown options",allOptions.contains(s));
        }

    }

    @Then("transaction table should have the given options as column name")
    public void transaction_table_should_have_the_given_options_as_column_name(List<String> list) {
        String transactionTable = accountActivityPage.getTransactionTable();

        for (String s : list) {

            Assert.assertTrue("Veriy the transaction table's column name",transactionTable.contains(s));

        }

    }

}
