package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(id = "aa_accountId")
    public WebElement accountDropDown;

    @FindBy(xpath = "//div[@id='all_transactions_for_account']//table//thead//tr")
    public List<WebElement> transactionTableHeaders;




    Select select=new Select(accountDropDown);

    public String getDefaultOption(){


        return select.getFirstSelectedOption().getText();
    }

    public String getAllOptions(){
        String dummy="";

        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {

            dummy+=option.getText()+" ";
        }

        return dummy;
    }

    public String getTransactionTable(){
        String dummy="";

        for (WebElement transactionTableHeader : transactionTableHeaders) {

            dummy+=transactionTableHeader.getText()+" ";
        }


        return dummy;

    }

}
