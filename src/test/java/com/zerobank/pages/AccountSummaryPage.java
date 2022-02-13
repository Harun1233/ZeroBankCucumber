package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage {


    @FindBy(id = "account_summary_link")
    public WebElement accountSummaryButton;

    public WebElement pageAccounts;



    public String pageAccountTypeText(){
        String dummy="";

        for (int i = 1; i <=4; i++) {

            pageAccounts=Driver.get().findElement(By.xpath("//h2[@class='board-header']["+i+"]"));
            BrowserUtils.waitForVisibility(pageAccounts,5);
            dummy+=pageAccounts.getText()+"-";

        }

        return dummy;
    }





}
