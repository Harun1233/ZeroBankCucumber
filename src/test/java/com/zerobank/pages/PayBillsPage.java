package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PayBillsPage extends BasePage{

    @FindBy(css = "#sp_payee")
    public WebElement payeeDropDown;

    @FindBy(css = "#sp_account")
    public WebElement accountDropDown;

    @FindBy(css = "#sp_amount")
    public WebElement amountInputBox;

    @FindBy(css = "#sp_date")
    public WebElement dateInputBox;

    @FindBy(css = "#sp_description")
    public WebElement descriptionInputBox;

    @FindBy(css = "#pay_saved_payees")
    public WebElement payButton;

    @FindBy(xpath = "//div[@id='alert_content']")
    public WebElement warningMessage;





    public void succesForm(){

        BrowserUtils.waitFor(2);
        new Select(payeeDropDown).selectByValue("sprint");
        BrowserUtils.waitFor(2);
        new Select(accountDropDown).selectByValue("1");
        BrowserUtils.waitFor(2);
        amountInputBox.sendKeys("5");
        BrowserUtils.waitFor(2);
        dateInputBox.sendKeys("13022022");
        BrowserUtils.waitFor(2);
        descriptionInputBox.sendKeys("description");
        BrowserUtils.waitFor(2);
        payButton.click();

    }

    public String getWarningMessage(){

        return warningMessage.getText();
    }

}
