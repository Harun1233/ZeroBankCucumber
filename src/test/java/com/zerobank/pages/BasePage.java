package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindAll({
            @FindBy(xpath = "//strong[text()='Online Banking']"),
            @FindBy(id = "online-banking")

    })
    public WebElement onlineBankingButton;



    public String getUrl(){

        return Driver.get().getCurrentUrl();
    }

    public String getText(WebElement element){

        return element.getText();

    }

    public void navigateToOnlineBank(){

        onlineBankingButton.click();
    }
}
